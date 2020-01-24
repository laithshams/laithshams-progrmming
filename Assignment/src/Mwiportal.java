import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Mwiportal {
	private static int counter;

	public static void main(String[] args) {

		ArrayList<Building> building = new ArrayList<Building>();

		ArrayList<Employee> employee = new ArrayList<Employee>();

		ArrayList<Owner> owner = new ArrayList<Owner>();

		ArrayList<Bill> bill = new ArrayList<Bill>();

		Readbuild(building);

		Reademp(employee);

		Readbill(bill);

		Readowner(building, owner);

		Login_page login = new Login_page();
		Home_page home = new Home_page();
		counter = 0;

		login.loginsystem.setVisible(true);
// Username: admin, Password: 1234 -> open home page
		login.login.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < employee.size(); i++) {
					if (login.username.getText().equals(employee.get(i).readID())
							&& login.password.getText().equals("1234")) {
						home.homepage.setBounds(login.loginsystem.getBounds());
						home.homepage.setVisible(true);
						login.loginsystem.setVisible(false);
					}
				}
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
				Buildings_page build = new Buildings_page();
				build.buildportal.setBounds(home.homepage.getBounds());
				build.buildportal.setVisible(true);
				home.homepage.setVisible(false);
				// add Building
				build.add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Addbuild_page addbuild = new Addbuild_page();
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
							for (int i = 0; i < building.size(); i++) {
								if (breader.region.equals(building.get(i).region)
										&& breader.village.equals(building.get(i).village)
										&& breader.neighborhood.equals(building.get(i).neighborhood)
										&& breader.land.equals(building.get(i).land)
										&& breader.tank.equals(building.get(i).tank)) {
									Success_page message = new Success_page();
									message.success.setText("Building is already exist");
									message.message.setVisible(true);
									i = building.size() + 1;
								} else {
									if (i == building.size() - 1) {
										addbuild.addbuild.setVisible(true);
										// continue adding Building
										addbuild.add.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												String success = "ID's not Exist";
												Success_page message = new Success_page();
												message.message.setVisible(true);
												breader.enterID(addbuild.ID.getText());
												if (breader.readID().equals("")) {
													success = "Wrong entry";
												} else {
													for (int i = 0; i < owner.size(); i++) {
														if (breader.readID().equals(owner.get(i).readID())) {
															success = Newbuild(breader);
															addbuild.addbuild.setVisible(false);
															message.success.setText(success);
															i = owner.size() + 1;
															if (success.equals("Building has been added successfuly")) {
																building.add(breader);
															}
														}
													}
												}
												message.success.setText(success);
											}
										});
									}
								}
							}
							if (building.size() == 0) {
								addbuild.addbuild.setVisible(true);
								// continue adding Building
								addbuild.add.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										String success = "ID's not Exist";
										Success_page message = new Success_page();
										message.message.setVisible(true);
										breader.enterID(addbuild.ID.getText());
										if (breader.readID().equals("")) {
											success = "Wrong entry";
										} else {
											for (int i = 0; i < owner.size(); i++) {
												if (breader.readID().equals(owner.get(i).readID())) {
													success = Newbuild(breader);
													addbuild.addbuild.setVisible(false);
													message.success.setText(success);
													i = owner.size() + 1;
													if (success.equals("Building has been added successfuly")) {
														building.add(breader);
													}
												}
											}
										}
										message.success.setText(success);
									}
								});
							}
						}
					}
				});
				// edit information of building
				build.edit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Editbuild_page editbuild = new Editbuild_page();
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
							if (building.size() == 0) {
								Success_page message = new Success_page();
								message.success.setText("building isn't exist");
								message.message.setVisible(true);
							}
							for (int i = 0; i < building.size(); i++) {
								if (breader.region.equals(building.get(i).region)
										&& breader.village.equals(building.get(i).village)
										&& breader.neighborhood.equals(building.get(i).neighborhood)
										&& breader.land.equals(building.get(i).land)
										&& breader.tank.equals(building.get(i).tank)) {
									editbuild.editbuild.setBounds(build.buildportal.getBounds());
									editbuild.editbuild.setVisible(true);
									build.buildportal.setVisible(false);
									breader.enterID(building.get(i).readID());
									int c = i;
									editbuild.edit.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											String success;
											Success_page message = new Success_page();
											message.message.setVisible(true);
											if (editbuild.region.getText().isEmpty()
													|| editbuild.village.getText().isEmpty()
													|| editbuild.neighborhood.getText().isEmpty()
													|| editbuild.land.getText().isEmpty()
													|| editbuild.tank.getText().isEmpty()) {
												success = "required field is empty..";
											} else {
												breader.region = editbuild.region.getText();
												breader.village = editbuild.village.getText();
												breader.neighborhood = editbuild.neighborhood.getText();
												breader.land = editbuild.land.getText();
												breader.tank = editbuild.tank.getText();
												building.set(c, breader);
												success = Editbuild(building);
												build.buildportal.setBounds(editbuild.editbuild.getBounds());
												editbuild.editbuild.setVisible(false);
												build.buildportal.setVisible(true);
												message.message.setVisible(true);
											}
											message.success.setText(success);
										}
									});
									i = building.size() + 1;
								}
								if (i == building.size() - 1) {
									Success_page message = new Success_page();
									message.success.setText("Building isn't exist");
									message.message.setVisible(true);
								}

							}
						}
						editbuild.back.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if (editbuild.region.getText().equals("") && editbuild.village.getText().equals("")
										&& editbuild.neighborhood.getText().equals("")
										&& editbuild.land.getText().equals("") && editbuild.tank.getText().equals("")) {
									build.buildportal.setBounds(editbuild.editbuild.getBounds());
									build.buildportal.setVisible(true);
									editbuild.editbuild.setVisible(false);
								} else {
									editbuild.region.setText("");
									editbuild.village.setText("");
									editbuild.neighborhood.setText("");
									editbuild.land.setText("");
									editbuild.tank.setText("");
								}
							}
						});
					}
				});
				build.owner.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Owner_page ownerpage = new Owner_page();
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
							Success_page message = new Success_page();
							message.message.setVisible(true);
							if (building.size() == 0) {
								message.success.setText("Building isn't exist");
							}
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
											message.message.setVisible(false);
											ownerpage.owner.setBounds(build.buildportal.getBounds());
											ownerpage.owner.setVisible(true);
											build.buildportal.setVisible(false);
											ownerpage.fname.setText(owner.get(j).fname);
											ownerpage.sname.setText(owner.get(j).sname);
											ownerpage.tname.setText(owner.get(j).tname);
											ownerpage.lname.setText(owner.get(j).lname);
											ownerpage.fname.setText(owner.get(j).fname);
											ownerpage.address.setText(owner.get(j).add);
											ownerpage.ID.setText(owner.get(j).readID());
											j = owner.size();
										} else {
											message.success.setText("error finding owner");
										}
									}
								} else {
									message.success.setText("Building isn't exist");
									message.message.setVisible(true);
								}
							}
						}
						ownerpage.back.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								build.buildportal.setBounds(ownerpage.owner.getBounds());
								build.buildportal.setVisible(true);
								ownerpage.owner.setVisible(false);
							}
						});
					}
				});
				build.pay.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Bills_page billpage = new Bills_page();
						Bill bireader = new Bill();
						if (build.ref.getText().isEmpty()) {
							build.ref.setText("required");
						} else {
							String success;
							Success_page message = new Success_page();
							bireader.enterref(build.ref.getText());
							if (bireader.readref().equals("0000000")) {
								success = "wrong entry";
								message.success.setText(success);
								message.message.setVisible(true);
							} else {
								int s = 0;
								if (bill.size() == 0) {
									message.success.setText("can't find bill");
									message.message.setVisible(true);
								}
								for (int i = 0; i < bill.size(); i++) {
									if (bireader.readref().equals(bill.get(i).readref())) {
										bireader.enteramount(bireader.readamount() + bill.get(i).readamount());
										bill.get(i).enteramount(0);
										billpage.amount.setText(String.valueOf(bireader.readamount()));
										s = 1;
									}
									if (s == 0 && bill.size() == i + 1) {
										success = "can't find bill";
										message.success.setText(success);
										message.message.setVisible(true);
									}
								}
								if (s == 1) {
									billpage.bills.setBounds(build.buildportal.getBounds());
									billpage.bills.setVisible(true);
									build.buildportal.setVisible(false);
									billpage.pay.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											String success;
											Success_page message = new Success_page();
											counter = counter + bireader.readamount();
											success = paybill(bill);
											build.buildportal.setBounds(billpage.bills.getBounds());
											build.buildportal.setVisible(true);
											billpage.bills.setVisible(false);
											message.message.setVisible(true);
											message.success.setText(success);

										}
									});
								}
							}
						}
						billpage.back.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								build.buildportal.setBounds(billpage.bills.getBounds());
								build.buildportal.setVisible(true);
								billpage.bills.setVisible(false);
							}
						});
					}
				});
				build.addbill.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Success_page message = new Success_page();
						Addbill_page addbill = new Addbill_page();
						Bill bireader = new Bill();
						if (build.ref.getText().isEmpty()) {
							build.ref.setText("Required");
						} else {
							bireader.enterref(build.ref.getText());
							if (bireader.readref().equals("0000000")) {
								message.success.setText("Wrong entry!!");
								message.message.setVisible(true);
							} else {
								addbill.addbill.setBounds(build.buildportal.getBounds());
								addbill.addbill.setVisible(true);
								build.buildportal.setVisible(false);
								addbill.add.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										if (addbill.amount.getText().isEmpty()) {
											message.success.setText("Required field");
											message.message.setVisible(true);
										} else {
											build.buildportal.setBounds(addbill.addbill.getBounds());
											build.buildportal.setVisible(true);
											message.message.setVisible(true);
											addbill.addbill.setVisible(false);
											try {
												bireader.enteramount(Integer.parseInt(addbill.amount.getText()));
												String success = Newbill(bireader);
												message.success.setText(success);
												if (success.equals("Bill has been added successfuly")) {
													bill.add(bireader);
												}
											} catch (NumberFormatException e1) {
												message.success.setText("Wrong entry!!");
											}
										}
									}
								});
							}
						}
						addbill.back.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								build.buildportal.setBounds(addbill.addbill.getBounds());
								build.buildportal.setVisible(true);
								addbill.addbill.setVisible(false);
							}
						});
					}
				});
				// go back to home page
				build.back.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (build.region.getText().equals("") && build.village.getText().equals("")
								&& build.neighborhood.getText().equals("") && build.land.getText().equals("")
								&& build.tank.getText().equals("") && build.ref.getText().equals("")) {
							home.homepage.setBounds(build.buildportal.getBounds());
							home.homepage.setVisible(true);
							build.buildportal.setVisible(false);
						} else {
							build.region.setText("");
							build.village.setText("");
							build.neighborhood.setText("");
							build.land.setText("");
							build.tank.setText("");
							build.ref.setText("");
						}
					}
				});
			}
		});
		home.eportal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employees_page emp = new Employees_page();
				emp.Empportal.setBounds(home.homepage.getBounds());
				emp.Empportal.setVisible(true);
				home.homepage.setVisible(false);
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
								if (employee.size() == 0) {
									emp.fname.setText("employee's");
									emp.sname.setText("not");
									emp.tname.setText("exist!!");
									emp.lname.setText("");
								}
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
												if (emp.ID.getText().equals(employee.get(c).readID())) {
													Editemp_page editemp = new Editemp_page();
													ereader.enterID(employee.get(c).readID());
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
															String success;
															Success_page message = new Success_page();
															message.message.setVisible(true);
															if (editemp.position.getText().isEmpty()
																	&& editemp.salary.getText().isEmpty()
																	&& editemp.yinc.getText().isEmpty()) {
																success = "required field";
															} else {
																ereader.position = editemp.position.getText();
																ereader.entersalary(
																		Integer.parseInt(editemp.salary.getText()));
																ereader.enteryinc(
																		Integer.parseInt(editemp.yinc.getText()));
																if (ereader.readsalary() == 0
																		|| ereader.readyinc() == 0) {
																	success = "wrong entry!!";
																} else {
																	employee.set(c, ereader);
																	success = Editemp(employee);
																	emp.Empportal
																			.setBounds(editemp.editemp.getBounds());
																	emp.Empportal.setVisible(true);
																	message.message.setVisible(true);
																	editemp.editemp.setVisible(false);
																}
															}
															message.success.setText(success);
														}
													});
													editemp.back.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															emp.Empportal.setBounds(editemp.editemp.getBounds());
															emp.Empportal.setVisible(true);
															editemp.editemp.setVisible(false);
														}
													});
												}
											}
										});
									} else {
										emp.fname.setText("employee's");
										emp.sname.setText("not");
										emp.tname.setText("exist!!");
										emp.lname.setText("");
									}
								}
								emp.add.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										if (emp.tname.getText().equals("exist!!")) {
											Addemp_page addemp = new Addemp_page();
											addemp.addemp.setBounds(emp.Empportal.getBounds());
											addemp.addemp.setVisible(true);
											emp.Empportal.setVisible(false);
											addemp.add.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {
													String success;
													Success_page message = new Success_page();
													message.message.setVisible(true);
													if (addemp.fname.getText().isEmpty()
															|| addemp.sname.getText().isEmpty()
															|| addemp.tname.getText().isEmpty()
															|| addemp.lname.getText().isEmpty()
															|| addemp.date.getText().isEmpty()
															|| addemp.position.getText().isEmpty()
															|| addemp.salary.getText().isEmpty()
															|| addemp.yinc.getText().isEmpty()) {
														success = "Required fields!!";
													} else {
														ereader.enterID(emp.ID.getText());
														ereader.fname = addemp.fname.getText();
														ereader.sname = addemp.sname.getText();
														ereader.tname = addemp.tname.getText();
														ereader.lname = addemp.lname.getText();
														ereader.date = addemp.date.getText();
														ereader.position = addemp.position.getText();
														try {
															ereader.entersalary(
																	Integer.parseInt(addemp.salary.getText()));
															ereader.enteryinc(Integer.parseInt(addemp.yinc.getText()));
														} catch (Exception e2) {
															// TODO: handle exception
															ereader.entersalary(0);
															ereader.enteryinc(0);
														}
														if (ereader.readsalary() == 0 || ereader.readyinc() == 0) {
															addemp.salary.setText("");
															addemp.yinc.setText("");
															success = "Check salary and yearly increase";
														} else {
															success = Newemp(ereader);
															emp.Empportal.setBounds(addemp.addemp.getBounds());
															emp.Empportal.setVisible(true);
															message.message.setVisible(true);
															addemp.addemp.setVisible(false);
														}
														if (success.equals("employee has been added successfuly")) {
															employee.add(ereader);
															emp.fname.setText(employee.get(employee.size() - 1).fname);
															emp.sname.setText(employee.get(employee.size() - 1).sname);
															emp.tname.setText(employee.get(employee.size() - 1).tname);
															emp.lname.setText(employee.get(employee.size() - 1).lname);
															emp.date.setText(employee.get(employee.size() - 1).date);
															emp.pos.setText(employee.get(employee.size() - 1).position);
															emp.salary.setText(String.valueOf(employee.get(employee.size() - 1).readsalary()));
															emp.yinc.setText(String.valueOf(employee.get(employee.size() - 1).readyinc()));
														}
													}
													message.success.setText(success);
												}
											});
											addemp.back.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {
													emp.Empportal.setBounds(addemp.addemp.getBounds());
													addemp.addemp.setVisible(false);
													emp.Empportal.setVisible(true);
												}
											});
										}
									}
								});
							}
						}
					}
				});
				emp.back.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (emp.ID.getText().equals("")) {
							home.homepage.setBounds(emp.Empportal.getBounds());
							home.homepage.setVisible(true);
							emp.Empportal.setVisible(false);
						} else {
							emp.ID.setText("");
						}
					}
				});
			}
		});
		home.cash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cash_page cash = new Cash_page();
				cash.cashpage.setBounds(home.homepage.getBounds());
				cash.cashpage.setVisible(true);
				home.homepage.setVisible(false);
				cash.cash.setText(String.valueOf(counter));
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
			for (int i = 0; i < bill.size(); i++) {
				pw.println(bill.get(i).readref() + ";" + bill.get(i).readamount());
			}
			pw.flush();
			pw.close();
			success = "Bill has been paid successfuly";
		} catch (Exception e) {
			// TODO: handle exception
			success = "Bill hasn't been paid";
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
			success = "Bill has been added successfuly";

		} catch (Exception e) {
			// TODO: handle exception
			success = "Bill hasn't been added";
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
			for (int i = 0; i < employee.size(); i++) {
				pw.println(employee.get(i).readID() + ";" + employee.get(i).fname + ";" + employee.get(i).sname + ";"
						+ employee.get(i).tname + ";" + employee.get(i).lname + ";" + employee.get(i).date + ";"
						+ employee.get(i).position + ";" + employee.get(i).readsalary() + ";"
						+ employee.get(i).readyinc());
			}
			pw.flush();
			pw.close();
			success = "Employee has been edited successfuly";
		} catch (Exception e) {
			// TODO: handle exception
			success = "Employee hasn't been edited";
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
			success = "employee has been added successfuly";

		} catch (Exception e) {
			// TODO: handle exception
			success = "Employee hasn't been added";
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
			success = "Building has been added successfuly";

		} catch (Exception e) {
			// TODO: handle exception
			success = "Building hasn't been added";
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
			for (int i = 0; i < building.size(); i++) {
				pw.println(building.get(i).readID() + ";" + building.get(i).region + ";" + building.get(i).village + ";"
						+ building.get(i).neighborhood + ";" + building.get(i).land + ";" + building.get(i).tank);
			}
			pw.flush();
			pw.close();
			success = "Building has been edited successfuly";
		} catch (Exception e) {
			// TODO: handle exception
			success = "Building hasn't been edited";
			return success;
		}
		return success;
	}
}
