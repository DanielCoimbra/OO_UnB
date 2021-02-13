package tp1;

import java.util.Scanner; //leitura de dados
import java.util.ArrayList;
import java.util.Random;


public class Tp1 {
	
	public static Scanner scan = new Scanner(System.in);

	public static Year year_list[] = {new Year(2011),new Year(2012),new Year(2013),new Year(2014),new Year(2015),new Year(2016),new Year(2017),new Year(2018),new Year(2019),new Year(2020)};
    
	public static class Year{
    	
    	int year;
    	Month months[];
    	boolean isLeap;
    	double median;
    	
    	public Year(int year) {
			this.year = year;
			this.isLeap = check_leap();
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
    	double	min,
    			max;

    	boolean from_leap,
    			temp_done;
    	
    	ArrayList<Day> days = new ArrayList<Day>();
    	ArrayList<Day> maxs = new ArrayList<Day>();
    	ArrayList<Day> mins = new ArrayList<Day>();
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
    			sum += day.temp;
    		}
    		
    		double total = sum / this.days.size();
    		
    		return total;
    	}
		
    	public ArrayList<Day> get_min_temp() {
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
    		
    		for (Day day : this.days) {
    			
    			if (day.temp == this.min)
    				this.mins.add(day);
    		}
    		return this.mins;
		}
    	
    	public ArrayList<Day> get_max_temp() {
    		int count =0;
    		
    		for (Day day : this.days){
        		if (count==0) {
        			this.max = day.temp;
        		}
        		else if(day.temp>max) {
        			this.max = day.temp;
        		}
    			count++;
        	}
    		
    		for (Day day : this.days) {
    			if (day.temp == this.max)
    				this.maxs.add(day);
    		}
    		return this.maxs;
		}
    }
    
    public static class Day{
    	int day;
    		
    	double  temp,
    			min,
    			max,
    			median;
    	
    	public Day(int day) {
    		this.day=day;
//    		System.out.println("dia" + this.day);
    		
    		
    	}
    	
    	public void take_temp() {
    		scan = new Scanner(System.in);
    		System.out.println("Digite a temperatura do dia " + this.day);
    		this.temp = scan.nextDouble();
    		
    		
    	}
    }
    
    public static ArrayList<Integer> please_scan(){
    	ArrayList<Integer> lista = new ArrayList<Integer>();
    	System.out.println("Digite o ano(2011~2020):");
 		try{
 			lista.add(scan.nextInt());
 		}catch(Exception e){
 			System.out.println("Ano não encontrado.");
 			callback_menu();
 		}
 		System.out.println("Digite o mês(1~12):");
 		try{
 			lista.add(scan.nextInt());
 		}catch(Exception e){
 			System.out.println("Mês não encontrado.");
 			callback_menu();
 		}

		
		if(lista.get(0) < 2011 || lista.get(0) > 2020) {
 			System.out.println("Ano não encontrado.");
 			callback_menu();
 		}
		
		return lista;
    }
    
    public static void med_temp(int user_year, int user_month) {
    	
    	
    	for(Year year :year_list) {
 			if(user_year == year.year) {
 				
 				try{
	 				if (year.months[user_month - 1].temp_done) {
	 					
	 					System.out.println("Temperatura média " + user_month + "/" + year.year+ ": "+year.months[user_month - 1].get_median_temp() + "°C");
	 					
	 				}else {
	 					
	 				}
 				}
 				catch(Exception e){
 					System.out.println("Mês não encontrado.");
 					callback_menu();
 				}
 				
 			}
 		}
    }
    public static void min_temp(int user_year, int user_month) {
    	
    	for(Year year :year_list) {
 			if(user_year == year.year) {
 				if (year.months[user_month - 1].temp_done) {
 					year.months[user_month - 1].get_min_temp().forEach((day) -> System.out.println("O dia " + day.day + " foi o mais frio de " +user_month +"/" + year.year +" "+"com "+ day.temp +"°C"));

 				}else {
 					System.out.println("Não há dados suficientes.");
 					callback_menu();
 				}
 				
 			}
 		}
    }
    public static void max_temp(int user_year, int user_month) {
    	
    	for(Year year :year_list) {
 			if(user_year == year.year) {
 				if (year.months[user_month - 1].temp_done) {
 					year.months[user_month - 1].get_max_temp().forEach((day) -> System.out.println("O dia " + day.day + " foi o mais quente de " +user_month +"/" + year.year +" "+"com "+ day.temp +"°C"));

 				}else {
 					System.out.println("Não há dados suficientes.");
 					callback_menu();
 				}
 				
 			}
 		}
    }
    
    public static void callback_menu() {
    	System.out.println("\nFim. Voltando ao menu...");
    	cli_menu();
    }
    
	 public static void cli_menu(){
		 
		 System.out.println("Escolha uma opção(digite apenas o número)\n");
		 System.out.println("1. Entrada de temperaturas");
		 System.out.println("2. Cálculo da temperatura média de um mês");
		 System.out.println("3. Cálculo da temperatura mínima de um mês");
		 System.out.println("4. Cálculo da temperatura máxima de um mês");
		 System.out.println("5. Relatório meteorológico completo\n");
		 
		 
		 int option = scan.nextInt();
		 ArrayList<Integer> lista = please_scan();
		 int user_year = lista.get(0),
			 user_month = lista.get(1);

		 switch(option) {
		 	
		 	case 1: //		 		make temperature entries for all of the month's days and save that data
		 		
		 		System.out.println("Você escolheu a opção 1\n");
		 		
		 		
		 		for(Year year :year_list) {
		 			if(user_year == year.year) {
		 				
		 				try{
			 				if (year.months[user_month - 1].temp_done) {
			 					System.out.println("Mẽs já registrado, deseja sobrescrever? Y/N");
			 					String str = scan.next();
			 					if (str.equalsIgnoreCase("y")) {
			 						for(int i=0;i<year.months[user_month - 1].get_num_days(); i++) {
				 						year.months[user_month - 1].days.get(i).take_temp();
				 					}
				 					year.months[user_month - 1].temp_done = true;
				 					System.out.println("Temperaturas registradas com sucesso");
				 					break;
			 					}
			 					else {
			 						System.out.println("Não sobrescrever.");
			 						break;
			 					}
			 					
			 				}else {
			 					for(int i=0;i<year.months[user_month - 1].get_num_days(); i++) {
			 						year.months[user_month - 1].days.get(i).take_temp();
			 					}
			 				}
		 					year.months[user_month - 1].temp_done = true;
		 					System.out.println("Temperaturas registradas com sucesso");
		 				}
		 				catch(Exception e){
		 					System.out.println("Mês não encontrado.");
		 					break;
		 				}
		 				break;
		 			}
		 		}

		 		break;

		 	case 2: //		 		calculate median temperature of a specific month of a specific year
		 		
		 		System.out.println("Você escolheu a opção 2\n");
		 		
		 		med_temp(user_year, user_month);
		 		callback_menu();
		 		break;

		 	case 3: //		 		calculate min temperature of a specific month of a specific year and say which day(s)
		 		
		 		System.out.println("Você escolheu a opção 3\n");
		 		
		 		min_temp(user_year, user_month);
		 		callback_menu();
		 		break;
		 	
		 	
		 	case 4: //		 		calculate max temperature of a specific month of a specific year and say which day(s)
		 		System.out.println("Você escolheu a opção 4\n");

		 		max_temp(user_year, user_month);
		 		callback_menu();
		 		
		 		break;
		 	
		 	case 5:
		 		System.out.println("Você escolheu a opção 5\n");
		 		
		 		
		 		
		 		
		 		
		 		for(Year year :year_list) {
		 			if(user_year == year.year) {
		 				if (year.months[user_month - 1].temp_done) {

		 					year.months[user_month - 1].days.forEach((day) -> System.out.println("O dia " + day.day+"/"+user_month+" teve média"+" "+day.temp +"°C"));
		 					
		 					med_temp(user_year, user_month);
		 					
		 					double min_temp = year.months[user_month - 1].get_min_temp().get(0).temp;
		 					System.out.println("Temperatura máxima: "+ min_temp +"°C");
		 			 		
		 					double max_temp = year.months[user_month - 1].get_max_temp().get(0).temp;
		 					System.out.println("Temperatura máxima: "+ max_temp +"°C");
		 					

		 				}else {
		 					System.out.println("Não há dados suficientes.");
		 					callback_menu();
		 				}
		 			}
		 		}
		 		
			
		 		
		 		break;
		 	default:
		 		System.out.println("Erro.");
		 		break;
		 }
		 
		 callback_menu();
	 }
	
	
	public static void main(String[] args){
		Random r = new Random();
		double rangeMin=-40,
				rangeMax=40;
		
		for (Day day : year_list[9].months[0].days) {
			day.temp = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
		}
		year_list[9].months[0].temp_done = true;
        cli_menu();
        
        }
}