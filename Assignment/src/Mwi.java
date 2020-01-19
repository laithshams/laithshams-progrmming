import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Mwi {
	private static int counter;

	public static void main(String[] args) {

		ArrayList<Building> building = new ArrayList<Building>();

		ArrayList<Employee> employee = new ArrayList<Employee>();

		ArrayList<Owner> owner = new ArrayList<Owner>();

		ArrayList<Bill> bill = new ArrayList<Bill>();

		Readbuild(building);

		Reademp(employee);
		System.out.println(employee.get(0).readID());
		Readbill(bill);

		Readowner(building, owner);

		Login_page login = new Login_page();
		Home_page home = new Home_page();
		Buildings_page build = new Buildings_page();
		Owner_page ownerpage = new Owner_page();
		Addbuild_page addbuild = new Addbuild_page();
		Editbuild_page editbuild = new Editbuild_page();
		Bills_page billpage = new Bills_page();
		Addbill_page addbill = new Addbill_page();
		Employees_page emp = new Employees_page();
		Editemp_page editemp = new Editemp_page();
		Addemp_page addemp = new Addemp_page();
		Cash_page cash = new Cash_page();
		counter = 0;

		login.loginsystem.setVisible(true);
// Username: admin, Password: admin -> open home page
		login.login.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (login.username.getText().equals("admin") && login.password.getText().equals("admin")) {
					home.homepage.setBounds(login.loginsystem.getBounds());
					home.homepage.setVisible(true);
					login.loginsystem.setVisible(false);
				}
			}
		});
// open Building Portal
		home.bportal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				build.buildportal.setBounds(home.homepage.getBounds());
				build.buildportal.setVisible(true);
				home.homepage.setVisible(false);
			}
		});

		// add Building
		build.add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Building breader = new Building();
				breader.region = build.region.getText();
				breader.village = build.village.getText();
				breader.neighborhood = build.neighborhood.getText();
				breader.land = build.land.getText();
				breader.tank = build.tank.getText();

				if (breader.region.isEmpty() || breader.village.isEmpty() || breader.neighborhood.isEmpty()
						|| breader.land.isEmpty() || breader.tank.isEmpty()) {
					build.region.setText("required");
					build.village.setText("required");
					build.neighborhood.setText("required");
					build.land.setText("required");
					build.tank.setText("required");
				} else {
					addbuild.addbuild.setVisible(true);

					// continue adding Building
					addbuild.add.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String success = null;
							breader.enterID(addbuild.ID.getText());
							if (breader.readID().equals("")) {
								addbuild.success.setText("Wrong Entry!");
							} else {
								for (int i = 0; i < owner.size(); i++) {
									if (breader.readID().equals(owner.get(i).readID())) {
										success = Newbuild(breader);
										addbuild.success.setText(success);
										i = owner.size() + 1;
										if (success.equals("success")) {
											building.add(breader);
										}
									}
								}
								if (success.equals(null)) {
									addbuild.success.setText("ID's not Exist");
								}
							}
						}
					});
				}

			}
		});
		// edit information of building
		build.edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Building breader = new Building();
				breader.region = build.region.getText();
				breader.village = build.village.getText();
				breader.neighborhood = build.neighborhood.getText();
				breader.land = build.land.getText();
				breader.tank = build.tank.getText();
				if (breader.region.isEmpty() || breader.village.isEmpty() || breader.neighborhood.isEmpty()
						|| breader.land.isEmpty() || breader.tank.isEmpty()) {
					build.region.setText("required");
					build.village.setText("required");
					build.neighborhood.setText("required");
					build.land.setText("required");
					build.tank.setText("required");
				} else {

					editbuild.editbuild.setBounds(build.buildportal.getBounds());
					editbuild.editbuild.setVisible(true);
					build.buildportal.setVisible(false);
					for (int i = 0; i < building.size(); i++) {
						if (breader.region.equals(building.get(i).region)
								&& breader.village.equals(building.get(i).village)
								&& breader.neighborhood.equals(building.get(i).neighborhood)
								&& breader.land.equals(building.get(i).land)
								&& breader.tank.equals(building.get(i).tank)) {
							breader.enterID(building.get(i).readID());
							int c = i;
							editbuild.edit.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if (editbuild.region.getText().isEmpty() || editbuild.village.getText().isEmpty()
											|| editbuild.neighborhood.getText().isEmpty()
											|| editbuild.land.getText().isEmpty()
											|| editbuild.tank.getText().isEmpty()) {
										editbuild.success.setText("required field is empty..");
									} else {
										breader.region = editbuild.region.getText();
										breader.village = editbuild.village.getText();
										breader.neighborhood = editbuild.neighborhood.getText();
										breader.land = editbuild.land.getText();
										breader.tank = editbuild.tank.getText();
										building.set(c, breader);
										String success = Editbuild(building);
										editbuild.success.setText(success);
									}
								}
							});
							i = building.size();
						}
						if (i == building.size() - 1) {
							editbuild.success.setText("Building's not exist");
						}
					}
				}
			}
		});

		editbuild.back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				build.buildportal.setBounds(editbuild.editbuild.getBounds());
				build.buildportal.setVisible(true);
				editbuild.editbuild.setVisible(false);
				editbuild.success.setText("Un\\Success");
				editbuild.region.setText("");
				editbuild.village.setText("");
				editbuild.neighborhood.setText("");
				editbuild.tank.setText("");
				editbuild.land.setText("");
			}
		});

		build.owner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Building breader = new Building();
				breader.region = build.region.getText();
				breader.village = build.village.getText();
				breader.neighborhood = build.neighborhood.getText();
				breader.land = build.land.getText();
				breader.tank = build.tank.getText();
				if (breader.region.isEmpty() || breader.village.isEmpty() || breader.neighborhood.isEmpty()
						|| breader.land.isEmpty() || breader.tank.isEmpty()) {
					build.region.setText("required");
					build.village.setText("required");
					build.neighborhood.setText("required");
					build.land.setText("required");
					build.tank.setText("required");
				} else {
					ownerpage.owner.setBounds(build.buildportal.getBounds());
					ownerpage.owner.setVisible(true);
					build.buildportal.setVisible(false);
					for (int i = 0; i < building.size(); i++) {
						if (breader.region.equals(building.get(i).region)
								&& breader.village.equals(building.get(i).village)
								&& breader.neighborhood.equals(building.get(i).neighborhood)
								&& breader.land.equals(building.get(i).land)
								&& breader.tank.equals(building.get(i).tank)) {
							int c = i;
							i = building.size();
							for (int j = 0; j < owner.size(); j++) {
								if (building.get(c).readID().equals(owner.get(j).readID())) {
									ownerpage.fname.setText(owner.get(j).fname);
									ownerpage.sname.setText(owner.get(j).sname);
									ownerpage.tname.setText(owner.get(j).tname);
									ownerpage.lname.setText(owner.get(j).lname);
									ownerpage.fname.setText(owner.get(j).fname);
									ownerpage.address.setText(owner.get(j).add);
									ownerpage.ID.setText(owner.get(j).readID());
									j = owner.size();
								} else {
									ownerpage.fname.setText("error");
									ownerpage.sname.setText("finding");
									ownerpage.tname.setText("owner");
								}
							}
						} else {
							ownerpage.fname.setText("Building's");
							ownerpage.sname.setText("not");
							ownerpage.tname.setText("exist");
							ownerpage.lname.setText("");
						}
					}
				}
			}
		});

		ownerpage.back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				build.buildportal.setBounds(ownerpage.owner.getBounds());
				build.buildportal.setVisible(true);
				ownerpage.owner.setVisible(false);
				ownerpage.fname.setText("fname");
				ownerpage.sname.setText("sname");
				ownerpage.tname.setText("tname");
				ownerpage.lname.setText("lname");
			}
		});

		build.pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bill bireader = new Bill();
				if (build.ref.getText().isEmpty()) {
					build.ref.setText("required");
				} else {
					bireader.enterref(build.ref.getText());
					billpage.bills.setBounds(build.buildportal.getBounds());
					billpage.bills.setVisible(true);
					build.buildportal.setVisible(false);
					if (bireader.readref().equals("0000000")) {
						billpage.amount.setText("wrong entry");
					} else {
						int s = 0;
						for (int i = 0; i < bill.size(); i++) {
							if (bireader.readref().equals(bill.get(i).readref())) {
								billpage.success.setText("Un\\Success");
								bireader.enteramount(bireader.readamount() + bill.get(i).readamount());
								bill.get(i).enteramount(0);
								billpage.amount.setText(String.valueOf(bireader.readamount()));
								s = 1;
							}
							if (s == 0) {
								billpage.success.setText("can't find bill");
							}
						}
						if (s == 1) {
							billpage.pay.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									counter = counter + bireader.readamount();
									String success = paybill(bill);
									billpage.success.setText(success);

								}
							});
						}
					}
				}
			}

		});

		billpage.back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				build.buildportal.setBounds(billpage.bills.getBounds());
				build.buildportal.setVisible(true);
				billpage.bills.setVisible(false);
			}
		});

		build.addbill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bill bireader = new Bill();
				if (build.ref.getText().isEmpty()) {
					build.ref.setText("Required");
				} else {
					bireader.enterref(build.ref.getText());
					addbill.addbill.setBounds(build.buildportal.getBounds());
					addbill.addbill.setVisible(true);
					build.buildportal.setVisible(false);
					if (bireader.readref().equals("0000000")) {
						addbill.success.setText("wrong entry!!");
					} else {
						addbill.add.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if (addbill.amount.getText().isEmpty()) {
									addbill.success.setText("Required field");
								} else {
									try {
										bireader.enteramount(Integer.parseInt(addbill.amount.getText()));
										String success = Newbill(bireader);
										addbill.success.setText(success);
										if (success.equals("success")) {
											bill.add(bireader);
										}
									} catch (NumberFormatException e1) {
										addbill.success.setText("Wrong entry!!");
									}
								}
							}
						});
					}
				}
			}
		});

		addbill.back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				build.buildportal.setBounds(addbill.addbill.getBounds());
				build.buildportal.setVisible(true);
				addbill.addbill.setVisible(false);
				addbill.success.setText("Un\\Success");
				addbill.amount.setText("$$");
			}
		});

		// go back to home page
		build.back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home.homepage.setBounds(build.buildportal.getBounds());
				home.homepage.setVisible(true);
				build.buildportal.setVisible(false);
			}
		});

		home.eportal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emp.Empportal.setBounds(home.homepage.getBounds());
				emp.Empportal.setVisible(true);
				home.homepage.setVisible(false);
			}
		});

		emp.search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee ereader = new Employee();
				if (emp.ID.getText().isEmpty()) {
					emp.ID.setText("required");
				} else {
					ereader.enterID(emp.ID.getText());
					if (ereader.readID().equals("000000000")) {
						emp.fname.setText("wrong");
						emp.sname.setText("ID");
						emp.tname.setText("number!!");
						emp.lname.setText("");
					} else {
						for (int i = 0; i < employee.size(); i++) {
							if (ereader.readID().equals(employee.get(i).readID())) {
								emp.fname.setText(employee.get(i).fname);
								emp.sname.setText(employee.get(i).sname);
								emp.tname.setText(employee.get(i).tname);
								emp.lname.setText(employee.get(i).lname);
								emp.date.setText(employee.get(i).date);
								emp.pos.setText(employee.get(i).position);
								emp.salary.setText(String.valueOf(employee.get(i).readsalary()));
								emp.yinc.setText(String.valueOf(employee.get(i).readyinc()));
								int c = i;
								i = employee.size();
								emp.edit.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										ereader.fname = employee.get(c).fname;
										ereader.sname = employee.get(c).sname;
										ereader.tname = employee.get(c).tname;
										ereader.lname = employee.get(c).lname;
										ereader.date = employee.get(c).date;
										editemp.editemp.setBounds(emp.Empportal.getBounds());
										editemp.editemp.setVisible(true);
										emp.Empportal.setVisible(false);
										editemp.edit.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												if (editemp.position.getText().isEmpty()
														&& editemp.salary.getText().isEmpty()
														&& editemp.yinc.getText().isEmpty()) {
													editemp.success.setText("required field");
												} else {
													ereader.position = editemp.position.getText();
													ereader.entersalary(Integer.parseInt(editemp.salary.getText()));
													ereader.enteryinc(Integer.parseInt(editemp.yinc.getText()));
													if (ereader.readsalary() == 0 || ereader.readyinc() == 0) {
														editemp.success.setText("wrong entry!!");
													} else {
														employee.set(c, ereader);
														System.out.println(employee.get(c).position);
														String success = Editemp(employee);
														editemp.success.setText(success);
													}
												}
											}
										});
										editemp.back.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												editemp.success.setText("Un\\Success");
												emp.Empportal.setBounds(editemp.editemp.getBounds());
												emp.Empportal.setVisible(true);
												editemp.editemp.setVisible(false);
											}
										});
									}
								});
							} else {
								emp.fname.setText("employee's");
								emp.sname.setText("not");
								emp.tname.setText("exist!!");
								emp.lname.setText("");
							}
						}
						if (emp.tname.getText().equals("exist!!")) {
							emp.add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									addemp.addemp.setBounds(emp.Empportal.getBounds());
									addemp.addemp.setVisible(true);
									emp.Empportal.setVisible(false);
									addemp.add.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											if (addemp.fname.getText().isEmpty() || addemp.sname.getText().isEmpty()
													|| addemp.tname.getText().isEmpty()
													|| addemp.lname.getText().isEmpty()
													|| addemp.date.getText().isEmpty()
													|| addemp.position.getText().isEmpty()
													|| addemp.salary.getText().isEmpty()
													|| addemp.yinc.getText().isEmpty()) {
												addemp.success.setText("Required fields!!");
											} else {
												ereader.fname = addemp.fname.getText();
												ereader.sname = addemp.sname.getText();
												ereader.tname = addemp.tname.getText();
												ereader.lname = addemp.lname.getText();
												ereader.date = addemp.date.getText();
												ereader.position = addemp.position.getText();
												ereader.entersalary(Integer.parseInt(addemp.salary.getText()));
												ereader.enteryinc(Integer.parseInt(addemp.yinc.getText()));
												if (ereader.readsalary() == 0 || ereader.readyinc() == 0) {
													addemp.salary.setText("");
													addemp.yinc.setText("");
													addemp.success.setText("check empty field");
												}
												String success = Newemp(ereader);
												addemp.success.setText(success);
												if (success.equals("success")) {
													employee.add(ereader);
												}
											}
										}
									});
								}
							});
							addemp.back.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									addemp.fname.setText(null);
									addemp.sname.setText(null);
									addemp.tname.setText(null);
									addemp.lname.setText(null);
									addemp.date.setText(null);
									addemp.position.setText(null);
									addemp.salary.setText(null);
									addemp.yinc.setText(null);
									emp.Empportal.setBounds(addemp.addemp.getBounds());
									emp.Empportal.setVisible(true);
									addemp.addemp.setVisible(false);
								}
							});
						}
					}
				}
			}
		});

		emp.back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home.homepage.setBounds(emp.Empportal.getBounds());
				home.homepage.setVisible(true);
				emp.Empportal.setVisible(false);
				emp.fname.setText("fname");
				emp.sname.setText("sname");
				emp.tname.setText("tname");
				emp.lname.setText("lname");
				emp.date.setText("date");
				emp.pos.setText("position");
				emp.salary.setText("$$");
				emp.yinc.setText("$$");
			}
		});

		home.cash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cash.cashpage.setBounds(home.homepage.getBounds());
				cash.cashpage.setVisible(true);
				home.homepage.setVisible(false);
				cash.cash.setText(String.valueOf(counter));
			}
		});
		
		cash.zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter = 0;
				cash.cash.setText(String.valueOf(counter));
				if (cash.cash.getText().equals("0")) {
					cash.success.setText("Success");
				} else {
					cash.success.setText("Unsuccess");
				}
			}
		});

		cash.back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home.homepage.setBounds(cash.cashpage.getBounds());
				home.homepage.setVisible(true);
				cash.cashpage.setVisible(false);
			}
		});

	}

	public static ArrayList<Owner> Readowner(ArrayList<Building> building, ArrayList<Owner> owner) {
		Scanner myReader;
		try {
			File ownerfile = new File("owner.csv");
			myReader = new Scanner(ownerfile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				Owner oreader = new Owner();
				String[] sdata = data.split(";");
				oreader.enterID(sdata[0]);
				oreader.fname = sdata[1];
				oreader.sname = sdata[2];
				oreader.tname = sdata[3];
				oreader.lname = sdata[4];
				oreader.add = sdata[5];
				for (int i = 0; i < building.size(); i++) {
					if (building.get(i).readID() == oreader.readID()) {
						oreader.building.add(building.get(i));
					}
				}
				owner.add(oreader);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return owner;
	}

	public static ArrayList<Bill> Readbill(ArrayList<Bill> bill) {
		Scanner myReader;
		try {
			File billfile = new File("bill.csv");
			myReader = new Scanner(billfile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				Bill bireader = new Bill();
				String[] sdata = data.split(";");
				int amount = Integer.parseInt(sdata[1]);
				bireader.enterref(sdata[0]);
				bireader.enteramount(amount);
				bill.add(bireader);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return bill;
	}

	public static String paybill(ArrayList<Bill> bill) {

		String success;
		try {

			FileWriter fw = new FileWriter("bill.csv", false);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.print("");
			pw.flush();
			pw.close();
			success = "success";
			try {

				fw = new FileWriter("bill.csv", true);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);

				for (int i = 0; i < bill.size(); i++) {
					pw.println(bill.get(i).readref() + ";" + bill.get(i).readamount());
				}
				pw.flush();
				pw.close();
				success = "success";
			} catch (Exception e) {
				// TODO: handle exception
				success = "Unsuccess";
				return success;
			}

		} catch (Exception e) {
			// TODO: handle exception
			success = "Unsuccess";
			return success;
		}
		return success;
	}

	public static String Newbill(Bill bill) {

		String success;
		try {

			FileWriter fw = new FileWriter("bill.csv", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(bill.readref() + ";" + bill.readamount());
			pw.flush();
			pw.close();
			success = "success";

		} catch (Exception e) {
			// TODO: handle exception
			success = "Unsuccess";
			return success;
		}
		return success;
	}

	public static ArrayList<Employee> Reademp(ArrayList<Employee> employee) {
		Scanner myReader;
		try {
			File empfile = new File("employee.csv");
			myReader = new Scanner(empfile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				Employee ereader = new Employee();
				String[] sdata = data.split(";");
				ereader.enterID(sdata[0]);
				ereader.fname = sdata[1];
				ereader.sname = sdata[2];
				ereader.tname = sdata[3];
				ereader.lname = sdata[4];
				ereader.date = sdata[5];
				ereader.position = sdata[6];
				ereader.entersalary(Integer.parseInt(sdata[7]));
				ereader.enteryinc(Integer.parseInt(sdata[8]));
				employee.add(ereader);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return employee;
	}

	public static String Editemp(ArrayList<Employee> employee) {

		String success;
		try {

			FileWriter fw = new FileWriter("employee.csv", false);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.print("");
			pw.flush();
			pw.close();
			success = "success";
			try {

				fw = new FileWriter("employee.csv", true);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);

				for (int i = 0; i < employee.size(); i++) {
					pw.println(employee.get(i).readID() + ";" + employee.get(i).fname + ";" + employee.get(i).sname
							+ ";" + employee.get(i).tname + ";" + employee.get(i).lname + ";" + employee.get(i).date
							+ ";" + employee.get(i).position + ";" + employee.get(i).readsalary() + ";"
							+ employee.get(i).readyinc());

				}
				pw.flush();
				pw.close();
				success = "success";
			} catch (Exception e) {
				// TODO: handle exception
				success = "Unsuccess";
				return success;
			}

		} catch (Exception e) {
			// TODO: handle exception
			success = "Unsuccess";
			return success;
		}
		return success;
	}

	public static String Newemp(Employee employee) {

		String success;
		try {

			FileWriter fw = new FileWriter("employee.csv", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(employee.readID() + ";" + employee.fname + ";" + employee.sname + ";" + employee.tname + ";"
					+ employee.lname + ";" + employee.date + ";" + employee.position + ";" + employee.readsalary() + ";"
					+ employee.readyinc());
			pw.flush();
			pw.close();
			success = "success";

		} catch (Exception e) {
			// TODO: handle exception
			success = "Unsuccess";
			return success;
		}
		return success;
	}

	public static ArrayList<Building> Readbuild(ArrayList<Building> building) {
		Scanner myReader;
		try {
			File buildfile = new File("building.csv");
			myReader = new Scanner(buildfile);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				Building breader = new Building();
				String[] sdata = data.split(";");
				breader.enterID(sdata[0]);
				breader.region = sdata[1];
				breader.village = sdata[2];
				breader.neighborhood = sdata[3];
				breader.land = sdata[4];
				breader.tank = sdata[5];
				building.add(breader);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return building;
	}

	public static String Newbuild(Building build) {

		String success;
		try {

			FileWriter fw = new FileWriter("building.csv", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(build.readID() + ";" + build.region + ";" + build.village + ";" + build.neighborhood + ";"
					+ build.land + ";" + build.tank);
			pw.flush();
			pw.close();
			success = "success";

		} catch (Exception e) {
			// TODO: handle exception
			success = "Unsuccess";
			return success;
		}
		return success;
	}

	public static String Editbuild(ArrayList<Building> building) {

		String success;
		try {

			FileWriter fw = new FileWriter("building.csv", false);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.print("");
			pw.flush();
			pw.close();
			success = "success";
			try {

				fw = new FileWriter("building.csv", true);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);

				for (int i = 0; i < building.size(); i++) {
					pw.println(building.get(i).readID() + ";" + building.get(i).region + ";" + building.get(i).village
							+ ";" + building.get(i).neighborhood + ";" + building.get(i).land + ";"
							+ building.get(i).tank);

				}
				pw.flush();
				pw.close();
				success = "success";
			} catch (Exception e) {
				// TODO: handle exception
				success = "Unsuccess";
				return success;
			}

		} catch (Exception e) {
			// TODO: handle exception
			success = "Unsuccess";
			return success;
		}
		return success;
	}
}
