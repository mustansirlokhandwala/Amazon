/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem;

import EcoSystem.BankAccount.BankAccount;
import EcoSystem.DeliveryVans.DeliveryVans;
import EcoSystem.Employee.Employee;
import EcoSystem.Enterprise.Amazon;
import EcoSystem.Enterprise.Bank;
import EcoSystem.Enterprise.Enterprise.EnterpriseType;
import EcoSystem.Enterprise.Supplier;
import EcoSystem.Enterprise.USPS;
import EcoSystem.Enterprise.WareHouse;
import EcoSystem.GeoConverting.AddressConverter;
import EcoSystem.Network.Network;
import EcoSystem.Organization.Organization;
import EcoSystem.Organization.Organization.OrganizationType;
import EcoSystem.Person.Address;
import EcoSystem.Person.Person;
import EcoSystem.Product.Product;
import EcoSystem.Product.ProductInventory;
import EcoSystem.Role.AmazonAdminRole;
import EcoSystem.Role.AmazonBillingEmployee;
import EcoSystem.Role.AmazonSupplierManagementEmployee;
import EcoSystem.Role.BankAdminRole;
import EcoSystem.Role.SupplierAdmin;
import EcoSystem.Role.SupplierBillingEmployeeRole;
import EcoSystem.Role.SupplierPackagingEmployeeRole;
import EcoSystem.Role.SysAdminRole;
import EcoSystem.Role.USPSAdminRole;
import EcoSystem.Role.USPSDeliveryEmployeeRole;
import EcoSystem.Role.WarehouseAdmin;
import EcoSystem.UserAccount.UserAccount;

/**
 *
 * @author Mustansir
 */
public class ConfigASystem {
    
  public static EcoSystem configure(){
      
      EcoSystem ecosystem = EcoSystem.getInstance();
      AddressConverter ac = new AddressConverter();
      Product product = null;
      ProductInventory productInventory = null;
      Amazon amazon = null;
      Bank bank = null;
      Person person = new Person();
      person.setFirstName("Mustansir");
      person.setLastName("lokhandwala");
      person.setAge(23);
      Address add = new Address();
      add.setStreetAddress("55 burbank");
      add.setCity("Boston");
      add.setState("MA");
      add.setCountry("USA");
      add.setZipCode(02115);
      add.setLatitude(Double.parseDouble(ac.calculatelatitude(String.valueOf(add))));
      add.setLongitude(Double.parseDouble(ac.calculateLongitude(String.valueOf(add))));
      person.setAddress(add);
      
      ecosystem.getPersonDirectory().getPersonList().add(person);
      
      Employee employee = new Employee();
      employee.setPerson(person);
      ecosystem.getEmployeeDirectory().getEmployeeList().add(employee);
      
      UserAccount ua = new UserAccount();
      ua.setUserName("sysadmin");
      ua.setPassword("sysadmin");
      ua.setPerson(person);
      ua.setRole(new SysAdminRole());
      ecosystem.getUserAccountDirectory().getUserAccountList().add(ua);
      
      //Creating networks 
      ecosystem.getNetworkDirectory().createandAddNetwork("USA");
      ecosystem.getNetworkDirectory().createandAddNetwork("INDIA");
      
      for(Network network: ecosystem.getNetworkDirectory().getNetworkList()){
          if(network.getName().equals("USA")){
              
              network.getNetworkDirectory().createandAddNetwork("Massachusetts");
              network.getNetworkDirectory().createandAddNetwork("New York");
              network.getNetworkDirectory().createandAddNetwork("California");
              network.getNetworkDirectory().createandAddNetwork("Washington");
          }
          if(network.getName().equals("INDIA")){
              network.getNetworkDirectory().createandAddNetwork("Maharashtra");
              network.getNetworkDirectory().createandAddNetwork("Gujarat");
          }
      }
      
      for(Network countryNetwork : ecosystem.getNetworkDirectory().getNetworkList()){
          if(countryNetwork.getName().equals("USA")){
              for(Network statenetwork: countryNetwork.getNetworkDirectory().getNetworkList()){
                  if(statenetwork.getName().equals("Massachusetts")){
                      statenetwork.getNetworkDirectory().createandAddNetwork("Boston");
                      statenetwork.getNetworkDirectory().createandAddNetwork("Allston");
                      statenetwork.getNetworkDirectory().createandAddNetwork("Cambridge");
                      statenetwork.getNetworkDirectory().createandAddNetwork("Sharron");
                  }
                  if(statenetwork.getName().equals("New York")){
                      statenetwork.getNetworkDirectory().createandAddNetwork("New York");
                      statenetwork.getNetworkDirectory().createandAddNetwork("Long Island");
                      statenetwork.getNetworkDirectory().createandAddNetwork("Manhattan");
                      statenetwork.getNetworkDirectory().createandAddNetwork("Albany");
                  }
                  if(statenetwork.getName().equals("California")){
                      statenetwork.getNetworkDirectory().createandAddNetwork("San Fransisco");
                      statenetwork.getNetworkDirectory().createandAddNetwork("San Jose");
                      statenetwork.getNetworkDirectory().createandAddNetwork("Santa Clara");
                      statenetwork.getNetworkDirectory().createandAddNetwork("Los Angeles");
                      
                  }
                  if(statenetwork.getName().equals("Washington")){
                      statenetwork.getNetworkDirectory().createandAddNetwork("Seattle");
                      
                      
                  }
                  
              }
          }
      }
      
     //Creating Enterprises 
      
      for(Network network : ecosystem.getNetworkDirectory().getNetworkList()){
          if(network.getName().equals("USA"))
          {
              Address bankAddress = new Address();
              bankAddress.setStreetAddress("1 BankOfAmerica Street");
              bankAddress.setCity("Seattle");
              bankAddress.setState("Washington");
              bankAddress.setCountry("USA");
              bankAddress.setZipCode(98144);              
              bank =(Bank)network.getEnterpriseDirectory().createandAddEnterprise("Bank Of America", EnterpriseType.Bank, bankAddress);
              
              
              person = new Person();
              person.setFirstName("Tasneem");
              person.setLastName("Merchant");
              person.setAge(23);
              add = new Address();
              add.setStreetAddress("1 BankOfAmerica Street");
              add.setCity("Boston");
              add.setState("Massachusetts");
              add.setCountry("USA");
              add.setZipCode(98144);              
              person.setAddress(add);
              BankAccount bk = new BankAccount();
              bk.setEnterprise(bank);
              bank.getBankAccountDirectory().getBankAccountList().add(bk);
              
              
              ecosystem.getPersonDirectory().getPersonList().add(person);
              employee = new Employee();
              employee.setPerson(person);
              bank.getEmployeeDirectory().getEmployeeList().add(employee);      
              ua = new UserAccount();
              ua.setUserName("bank");
              ua.setPassword("bank");
              ua.setPerson(person);
              ua.setRole(new BankAdminRole());
              bank.getUserAccountDirectory().getUserAccountList().add(ua);
              
              
              
              
              Address amazonadd = new Address();
              amazonadd.setStreetAddress("1200 12th Avenue");
              amazonadd.setCity("Seattle");
              amazonadd.setState("Washington");
              amazonadd.setCountry("USA");
              amazonadd.setZipCode(98144);
              amazonadd.setLatitude(Double.parseDouble(ac.calculatelatitude(String.valueOf(amazonadd))));
              amazonadd.setLongitude(Double.parseDouble(ac.calculateLongitude(String.valueOf(amazonadd))));
              amazon =(Amazon)network.getEnterpriseDirectory().createandAddEnterprise("AmazonUSA", EnterpriseType.Amazon, amazonadd);
               bk = new BankAccount();
              bk.setEnterprise(amazon);
              bk.setBankBalance(1000000);
              bank.getBankAccountDirectory().getBankAccountList().add(bk);
              person = new Person();
              person.setFirstName("Jay");
              person.setLastName("parikh");
              person.setAge(23);
              add = new Address();
              add.setStreetAddress("1200 12th Avenue");
              add.setCity("Seattle");
              add.setState("Washington");
              add.setCountry("USA");
              add.setZipCode(98144);
              
              person.setAddress(add);
              
              ecosystem.getPersonDirectory().getPersonList().add(person);
              employee = new Employee();
              employee.setPerson(person);
              amazon.getEmployeeDirectory().getEmployeeList().add(employee);      
              ua = new UserAccount();
              ua.setUserName("amazon");
              ua.setPassword("amazon");
              ua.setPerson(person);
              ua.setRole(new AmazonAdminRole());
              amazon.getUserAccountDirectory().getUserAccountList().add(ua);
              
              
                  Organization organization = amazon.getOrganizationDirectory().createOrganization(OrganizationType.AmazonBilling);
                  person = new Person();
                  person.setFirstName("Sneha");
                  person.setLastName("kothari");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("1200 12th Avenue");
                  add.setCity("Seattle");
                  add.setState("Washington");
                  add.setCountry("USA");
                  add.setZipCode(98114);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  amazon.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("amazonsneha");
                  ua.setPassword("amazonsneha");
                  ua.setPerson(person);
                  ua.setRole(new  AmazonBillingEmployee());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  
                  person = new Person();
                  person.setFirstName("Deepesh ");
                  person.setLastName("Tibrewala");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("1200 12th Avenue");
                  add.setCity("Seattle");
                  add.setState("Washington");
                  add.setCountry("USA");
                  add.setZipCode(98114);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  amazon.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("amazondeepesh");
                  ua.setPassword("amazondeepesh");
                  ua.setPerson(person);
                  ua.setRole(new  AmazonBillingEmployee());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  //Amazon 1 billing org 
                  organization = amazon.getOrganizationDirectory().createOrganization(OrganizationType.AmazonSupplierSupport);
                  person = new Person();
                  person.setFirstName("Vidit");
                  person.setLastName("Mantri");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("1200 12th Avenue");
                  add.setCity("Seattle");
                  add.setState("Washington");
                  add.setCountry("USA");
                  add.setZipCode(98114);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  amazon.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("amazonvidit");
                  ua.setPassword("amazonvidit");
                  ua.setPerson(person);
                  ua.setRole(new  AmazonSupplierManagementEmployee());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  
                  person = new Person();
                  person.setFirstName("swapnil ");
                  person.setLastName("Korgaonkar");
                  person.setAge(23);
                  add = new Address();
                  add = new Address();
                  add.setStreetAddress("1200 12th Avenue");
                  add.setCity("Seattle");
                  add.setState("Washington");
                  add.setCountry("USA");
                  add.setZipCode(98114);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  amazon.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("amazonswapnil");
                  ua.setPassword("amazonswapnil");
                  ua.setPerson(person);
                  ua.setRole(new  AmazonSupplierManagementEmployee());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  
                  
              amazon.getUserAccountDirectory().getUserAccountList().add(ua);
              amazon.getProductTypeDirectory().getProducttypeList().add("Electronics");
              amazon.getProductTypeDirectory().getProducttypeList().add("Food");
              amazon.getProductTypeDirectory().getProducttypeList().add("Clothes");
              amazon.getProductTypeDirectory().getProducttypeList().add("Games");
              amazon.getProductTypeDirectory().getProducttypeList().add("Home Appliances");
              amazon.getProductTypeDirectory().getProducttypeList().add("Tool");
              amazon.getProductTypeDirectory().getProducttypeList().add("Computers");
              amazon.getProductTypeDirectory().getProducttypeList().add("Laptops");
              amazon.getProductTypeDirectory().getProducttypeList().add("Mobile"); 
              
              
              
                      
              
          }
       for(Network stateNetwork : network.getNetworkDirectory().getNetworkList()){
           if(stateNetwork.getName().equals("Massachusetts")){
               for(Network cityNetwork : stateNetwork.getNetworkDirectory().getNetworkList()){
                  if(cityNetwork.getName().equals("Boston")){
                  //supplier 1
                  add = new Address();
                  add.setStreetAddress("300 Huntington Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  add.setLatitude(Double.parseDouble(ac.calculatelatitude(String.valueOf(add))));
                  add.setLongitude(Double.parseDouble(ac.calculateLongitude(String.valueOf(add))));
                  String name = " College Convinience ";
                  Supplier supplier = (Supplier)cityNetwork.getEnterpriseDirectory().createandAddEnterprise(name, EnterpriseType.Supplier, add);
                  BankAccount bk = new BankAccount();
                  bk.setEnterprise(supplier);
                  bk.setBankBalance(100000); 
                  bank.getBankAccountDirectory().getBankAccountList().add(bk);
                  amazon.getSupplierDirectory().getSupplierList().add(supplier);
                  person = new Person();
                  person.setFirstName("Asif");
                  person.setLastName("Motorwala");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("300 Huntington Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  supplier.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("college");
                  ua.setPassword("college");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierAdmin());
                  supplier.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  //supplier one packaging org
                  Organization organization = supplier.getOrganizationDirectory().createOrganization(OrganizationType.SupplierPackaging);
                  person = new Person();
                  person.setFirstName("Rohan ");
                  person.setLastName("Shetty");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("300 Huntington Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  supplier.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("collegerohan");
                  ua.setPassword("collegerohan");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierPackagingEmployeeRole());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  
                  person = new Person();
                  person.setFirstName("Deepak ");
                  person.setLastName("Kataria");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("300 Huntington Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  supplier.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("collegedeepak");
                  ua.setPassword("collegedeepak");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierPackagingEmployeeRole());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  //Supplier 1 billing org 
                  organization = supplier.getOrganizationDirectory().createOrganization(OrganizationType.SupplierBilling);
                  person = new Person();
                  person.setFirstName("Karan ");
                  person.setLastName("Mankodi");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("300 Huntington Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  supplier.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("collegekaran");
                  ua.setPassword("collegekaran");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierBillingEmployeeRole());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  
                  person = new Person();
                  person.setFirstName("Rahul ");
                  person.setLastName("Agarwal");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("300 Huntington Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  supplier.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("collegerahul");
                  ua.setPassword("collegerahul");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierBillingEmployeeRole());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Milk");
                  product.setProductCompany(supplier);
                  product.setProductPrice(5.99);
                  product.setProductType("Food");
                  product.setProductVolume(10);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Milk");
                  product.setProductCompany(supplier);
                  product.setProductPrice(5.99);
                  product.setProductType("Food");
                  product.setProductVolume(10);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Roti");
                  product.setProductCompany(supplier);
                  product.setProductPrice(6.99);
                  product.setProductType("Food");
                  product.setProductVolume(5);
                  productInventory = supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Biscuits");
                  product.setProductCompany(supplier);
                  product.setProductPrice(2.99);
                  product.setProductType("Food");
                  product.setProductVolume(2);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Bread");
                  product.setProductCompany(supplier);
                  product.setProductPrice(1.99);
                  product.setProductType("Food");
                  product.setProductVolume(10);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Vegetables");
                  product.setProductCompany(supplier);
                  product.setProductPrice(2.99);
                  product.setProductType("Food");
                  product.setProductVolume(4);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Ice Cream");
                  product.setProductCompany(supplier);
                  product.setProductPrice(5.99);
                  product.setProductType("Food");
                  product.setProductVolume(10);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  
                  // Supplier 2
                  add = new Address();
                  add.setStreetAddress("231 Massachusetts Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  add.setLatitude(Double.parseDouble(ac.calculatelatitude(String.valueOf(add))));
      add.setLongitude(Double.parseDouble(ac.calculateLongitude(String.valueOf(add))));
                  name = " CVS Pharmacy ";
                  supplier = (Supplier)cityNetwork.getEnterpriseDirectory().createandAddEnterprise(name, EnterpriseType.Supplier, add);
                  bk = new BankAccount();
        bk.setEnterprise(supplier);
        bk.setBankBalance(100000);  
        bank.getBankAccountDirectory().getBankAccountList().add(bk);
                  amazon.getSupplierDirectory().getSupplierList().add(supplier);
                  person = new Person();
                  person.setFirstName("Asif");
                  person.setLastName("Motorwala");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("231 Massachusetts Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  supplier.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("cvs");
                  ua.setPassword("cvs");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierAdmin());
                  supplier.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  //supplier one packaging org
                  organization = supplier.getOrganizationDirectory().createOrganization(OrganizationType.SupplierPackaging);
                  person = new Person();
                  person.setFirstName("Rohan ");
                  person.setLastName("Shetty");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("231 Massachusetts Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  supplier.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("cvsrohan");
                  ua.setPassword("cvsrohan");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierPackagingEmployeeRole());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  
                  person = new Person();
                  person.setFirstName("Deepak ");
                  person.setLastName("Kataria");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("231 Massachusetts Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  organization.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("cvsdeepak");
                  ua.setPassword("cvsdeepak");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierPackagingEmployeeRole());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  //Supplier 1 billing org 
                  organization = supplier.getOrganizationDirectory().createOrganization(OrganizationType.SupplierBilling);
                  person = new Person();
                  person.setFirstName("Karan ");
                  person.setLastName("Mankodi");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("231 Massachusetts Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  supplier.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("cvskaran");
                  ua.setPassword("cvskaran");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierBillingEmployeeRole());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  
                  person = new Person();
                  person.setFirstName("Rahul ");
                  person.setLastName("Agarwal");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("231 Massachusetts Ave");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02115);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  supplier.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("cvsrahul");
                  ua.setPassword("cvsrahul");
                  ua.setPerson(person);
                  ua.setRole(new  SupplierBillingEmployeeRole());
                  organization.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Milk");
                  product.setProductCompany(supplier);
                  product.setProductPrice(5.99);
                  product.setProductType("Food");
                  product.setProductVolume(10);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Milk");
                  product.setProductCompany(supplier);
                  product.setProductPrice(5.99);
                  product.setProductType("Food");
                  product.setProductVolume(10);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Roti");
                  product.setProductCompany(supplier);
                  product.setProductPrice(6.99);
                  product.setProductType("Food");
                  product.setProductVolume(5);
                  productInventory = supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Biscuits");
                  product.setProductCompany(supplier);
                  product.setProductPrice(2.99);
                  product.setProductType("Food");
                  product.setProductVolume(2);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Bread");
                  product.setProductCompany(supplier);
                  product.setProductPrice(1.99);
                  product.setProductType("Food");
                  product.setProductVolume(10);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Vegetables");
                  product.setProductCompany(supplier);
                  product.setProductPrice(2.99);
                  product.setProductType("Food");
                  product.setProductVolume(4);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  product =supplier.getProductCatalog().createandAddProduct();
                  product.setName("Ice Cream");
                  product.setProductCompany(supplier);
                  product.setProductPrice(5.99);
                  product.setProductType("Food");
                  product.setProductVolume(10);
                  productInventory =supplier.getInventoryList().addProductInventory(product);
                  supplier.getInventoryList().increaseInventory(productInventory, 50);
                  
                  //USPS
                  add = new Address();
                  add.setStreetAddress("31 Milk Street");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(2109);
                  add.setLatitude(Double.parseDouble(ac.calculatelatitude(String.valueOf(add))));
                  add.setLongitude(Double.parseDouble(ac.calculateLongitude(String.valueOf(add))));
                  name = " Usps Milk Street ";
                  USPS usps = (USPS)cityNetwork.getEnterpriseDirectory().createandAddEnterprise(name, EnterpriseType.USPS, add);
                   bk = new BankAccount();
        bk.setEnterprise(usps);
        bk.setBankBalance(100000);
        bank.getBankAccountDirectory().getBankAccountList().add(bk);
                  person = new Person();
                  person.setFirstName("Asif");
                  person.setLastName("Motorwala");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("31 Milk Street");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(2109);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  usps.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("usps");
                  ua.setPassword("usps");
                  ua.setPerson(person);
                  ua.setRole(new  USPSAdminRole());
                  usps.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  
                  //USPS vans
                  
                  person = new Person();
                  person.setFirstName("Rohan ");
                  person.setLastName("Shetty");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("21 Milk Street");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(2109);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  usps.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("uspsrohan");
                  ua.setPassword("uspsrohan");
                  ua.setPerson(person);
                  ua.setRole(new  USPSDeliveryEmployeeRole());
                  usps.getUserAccountDirectory().getUserAccountList().add(ua);
                  DeliveryVans dv =usps.getDeliveryVanDirectory().createandAddVans();
                  dv.setDriver(person);
                  
                  
                  person = new Person();
                  person.setFirstName("Deepak ");
                  person.setLastName("Kataria");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("21 Milk Street");
                  add.setCity("Boston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(2109);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  usps.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("uspsdeepak");
                  ua.setPassword("uspsdeepak");
                  ua.setPerson(person);
                  ua.setRole(new  USPSDeliveryEmployeeRole());
                  usps.getUserAccountDirectory().getUserAccountList().add(ua);
                  dv =usps.getDeliveryVanDirectory().createandAddVans();
                  dv.setDriver(person);

                  

                  
                       
                  }
                  if(cityNetwork.getName().equals("Allston")){
                  add = new Address();
                  add.setStreetAddress("12 Brighton Ave");
                  add.setCity("Allston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02134);
                  add.setLatitude(Double.parseDouble(ac.calculatelatitude(String.valueOf(add))));
                  add.setLongitude(Double.parseDouble(ac.calculateLongitude(String.valueOf(add))));
                  String name = " Massachusetts Warehouse ";
                  WareHouse wareHouse = (WareHouse)cityNetwork.getEnterpriseDirectory().createandAddEnterprise(name, EnterpriseType.Warehouse, add);
                  
        
          
        
                  amazon.getWarehouseDirectory().getWareHouseList().add(wareHouse);
                  person = new Person();
                  person.setFirstName("Zuzer");
                  person.setLastName("Lokhandwala");
                  person.setAge(23);
                  add = new Address();
                  add.setStreetAddress("12 Brigton Avenue");
                  add.setCity("Allston");
                  add.setState("Massachusetts");
                  add.setCountry("USA");
                  add.setZipCode(02134);
                  
                  person.setAddress(add);             
              
                  ecosystem.getPersonDirectory().getPersonList().add(person);
                  employee = new Employee();
                  employee.setPerson(person);
                  wareHouse.getEmployeeDirectory().getEmployeeList().add(employee);      
                  ua = new UserAccount();
                  ua.setUserName("warehousezuzer");
                  ua.setPassword("warehousezuzer");
                  ua.setPerson(person);
                  ua.setRole(new  WarehouseAdmin());
                  wareHouse.getUserAccountDirectory().getUserAccountList().add(ua);
                  
                  }
                      
                  
                  
                  
                  
                   
               }
           }
       }
          
      }
      
      
       
      return ecosystem;
  }
    
    
    
   
    
            
   
   
    
            
    
}
