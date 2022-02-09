/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMART
 */
public abstract class Client extends Item implements Sell_Bill  {
int id;
String name;
String phone_number;
int sell_bill_id;
@Override
 public  void add_item_tobill(){}
 public  void remove_item_frombill(){}
 public  void total_price(){}
}
