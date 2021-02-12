package tp1;

import java.util.Scanner; //leitura de dados
import java.util.ArrayList;


public class Tp1 {

	public static Year year_list[] = {new Year(2011),new Year(2012),new Year(2013),new Year(2014),new Year(2015),new Year(2016),new Year(2017),new Year(2018),new Year(2019),new Year(2020)};
    
	public static class Year{
    	
    	int year;
    	Month months[];
    	boolean isLeap;
    	double median;
    	
    	public Year(int year) {
			this.year = year;
			this.isLeap = check_leap();
			
//			System.out.println("new year");
			create_months();
		}
    	
    	public boolean check_leap() {
    		
    		boolean leap = false;
    		
    		if((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0)
    			leap = true;
    		
    		return leap;
    	}
    	public void create_months() {
    		if (this.isLeap) {
    			Month months[] = {new Month(1),new Month(2, true),new Month(3),new Month(4),new Month(5),new Month(6),new Month(7),new Month(8),new Month(9),new Month(10),new Month(11),new Month(12)};
    			this.months = months;
    		}else {
    			Month months[] = {new Month(1),new Month(2),new Month(3),new Month(4),new Month(5),new Month(6),new Month(7),new Month(8),new Month(9),new Month(10),new Month(11),new Month(12)};
    			this.months = months;
    		}
    	}
	}
	
    
    public static class Month{
    	int month;
    	double
    		min,
    		max;

    	boolean from_leap;
    	
    	ArrayList<Day> days = new ArrayList<Day>();
    	
    	double median;
    	
    	public Month(int month) {
			this.month = month;
//			System.out.println("new month"+this.month);
			create_days();
		}
    	
    	public Month(int month, boolean from_leap) {
    		this.month = month;
    		this.from_leap = true;
//    		System.out.println("new month"+this.month);
			create_days();
    	}
    	
    	public void create_days() {
    		for(int i=0; i<this.get_num_days(); i++) {
    			this.days.add(new Day(i+1));
    		}
    	}
    	
    	public int get_num_days() {
    		
 	        if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
 	           return 31; 
 	            
 	        }else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
 	        	return 30;
 	            
 	        }
 	        else if (this.month == 2) {
 	            if(this.from_leap)
 	                return 29;
 	                
 	            else
 	            	return 28;
 	        }
 	        return 0;
    	}
    	
    	public double get_median_temp() {
    		double sum = 0;

    		for (Day day : this.days){
    		sum += day.day;
    		}
    		
    		double total = sum / get_num_days();
    		
    		return total;
    	}
		
    	public double get_min_temp() {
    		int count =0;
    		
    		for (Day day : this.days){
        		if (count==0) {
        			this.min = day.temp;
        		}
        		else if(day.temp<min) {
        			this.min = day.temp;
        		}
    			count++;
        	}
    		return this.min;
		}
		
		public double get_max_temp() {
    		int count =0;
    		for (Day day : this.days){
        		if (count==0)
        			this.max = day.temp;
        		else if(day.temp>max)
        			this.max = day.temp;
        			
    			count++;
        	}
    		return this.max;
		}
    	
    }
    
    public static class Day{
    	int day,
    		temp,
    		min,
    		max;
    	
    	double median;
    	
    	public Day(int day) {
    		this.day=day;
//    		System.out.println("dia" + this.day);
    		
    		
    	}
    	
    	public void take_temp() {
    		Scanner scan = new Scanner(System.in);
    		System.out.println("Digite a temperatura do dia " + this.day);
    		this.temp = scan.nextInt();
    		
    	}
    }
    
    
	 public static void cli_menu(){
		 
		 System.out.println("Escolha uma opção(digite apenas o número)\n");
		 System.out.println("1. Entrada de temperaturas");
		 System.out.println("2. Cálculo da temperatura média de um mês");
		 System.out.println("3. Cálculo da temperatura mínima de um mês");
		 System.out.println("4. Cálculo da temperatura máxima de um mês");
		 System.out.println("5. Relatório meteorológico completo\n");
		 
		 Scanner scan = new Scanner(System.in);
		 int option = scan.nextInt();
		 int this_year;
		 switch(option) {
		 	
		 	case 1:
		 		System.out.println("1:\n");
		 		System.out.println("Digite o ano(2011~2020):");
		 		this_year = scan.nextInt();
		 		for(Year year :year_list) {
		 			if(this_year == year.year) {
		 				System.out.println("Digite o mês(1~12):\n");
		 				int this_month = scan.nextInt();
		 				try{
		 					System.out.println(year.months[this_month - 1].month);
		 				}
		 				catch(Exception e){
		 					System.out.println("Mês não encontrado. Voltando ao início");;
		 				}
		 			}
		 			
		 			else {
		 				System.out.println("Ano não encontrado. Voltando ao menu...");
		 				break;
		 			}
		 		}
//		 		System.out.println("Erro. Voltando ao ínicio...\n");
//		 		cli_menu();
		 		
		 		
		 		
		 		
//		 		make temperature entries for all of the month's days and save that data
		 		break;
		 	
		 	
		 	case 2:
		 		
//		 		calculate median temperature of a specific month of a specific year
		 		break;
		 	
		 	
		 	case 3:
		 		
//		 		calculate min temperature of month
		 		break;
		 	
		 	
		 	case 4:
		 		
//		 		calculate max temperature of month
		 		break;
		 	case 5:
		 		
//		 		full meteorologic report:
//		 			median temp for each dom
//		 			median temp of month
//		 			min temp of month
//		 			max temp of month
		 		break;
		 	
		 	
		 	default:
		 		System.out.println("chose wrong");
		 		break;
		 }
		 
		 System.out.println("\nDone. Looping back to menu...");
		 
//		 Thread.sleep(2);
		 cli_menu();
	 }

	 
	public static Year find_year(int n_year){
		for (Year year : year_list){
			if (year.year == n_year)
			return year;
			
		}
		return new Year(0);
	}
	
	public static Month find_month(int n_month) {
		return new Month(0);
	}
	
	public static void case1() {
		
	}
	public static void case2() {
			
		}
	public static void case3() {
		
	}
	public static void case4() {
		
	}
	public static void case5() {
		
	}

	
	
	public static void main(String[] args){
		
        cli_menu();
        
        }
}