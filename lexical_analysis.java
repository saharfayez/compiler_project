


import java.util.Scanner;


public class lexical_analysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String string=scanner.nextLine();
        String [] tokens = string.split(" ");
        
        String [] keywords={"package","import","public","protected","private","static","extends","implements",
        "module","native","new","requires","return","strictfp","super","this","synchronized","throw","throws","transient","volatile",
        "exports","instanceof","goto","interface","assert","class","void","abstract","boolean","const",
        "int","String","double","float","short","long","var","final","char","byte","switch","case",
        "break","default","continue","try","catch","finally","if","else","for","while","do"};
              

        for(int token_index=0; token_index<tokens.length; token_index++){
            
            String token= tokens[token_index];
            
            for(int keyword_index=0; keyword_index < keywords.length; keyword_index ++){
                
                if(token.equals(keywords[keyword_index]) ){
                    System.out.println("keyword :  "+ token);
                }
            }
            
            if((token.matches("_*[a-zA-Z]+_*[0-9]*_*")) && !(token.equals(keywords[0])|| token.equals(keywords[1]) 
                    || token.equals(keywords[2]) || token.equals(keywords[3]) || token.equals(keywords[4]) ||
                    token.equals(keywords[5]) || token.equals(keywords[6]) || token.equals(keywords[7])    || 
                    token.equals(keywords[8]) || token.equals(keywords[9]) ||  token.equals(keywords[10])  || 
                    token.equals(keywords[11]) || token.equals(keywords[12]) || token.equals(keywords[13]) ||
                    token.equals(keywords[14]) || token.equals(keywords[15]) || token.equals(keywords[16]) ||
                    token.equals(keywords[17]) || token.equals(keywords[18]) || token.equals(keywords[19]) || 
                    token.equals(keywords[20]) || token.equals(keywords[21]) || token.equals(keywords[22]) ||
                    token.equals(keywords[23]) || token.equals(keywords[24]) || token.equals(keywords[25]) || 
                    token.equals(keywords[26]) || token.equals(keywords[27]) ||  token.equals(keywords[28])|| 
                    token.equals(keywords[29]) || token.equals(keywords[30]) || token.equals(keywords[31]) ||
                    token.equals(keywords[32]) || token.equals(keywords[33]) || token.equals(keywords[34]) ||
                    token.equals(keywords[35]) || token.equals(keywords[36]) || token.equals(keywords[37]) || 
                    token.equals(keywords[38]) || token.equals(keywords[39]) || token.equals(keywords[40]) ||
                    token.equals(keywords[41]) || token.equals(keywords[42]) || token.equals(keywords[43]) || 
                    token.equals(keywords[44]) || token.equals(keywords[45]) ||  token.equals(keywords[46])|| 
                    token.equals(keywords[47]) || token.equals(keywords[48]) || token.equals(keywords[49]) ||
                    token.equals(keywords[50]) || token.equals(keywords[51]) || token.equals(keywords[52]) ||
                    token.equals(keywords[53]))  ){
            
                 System.out.println("identifier :  "+token);
            }
            else if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")||token.equals("%")||
                    token.equals("^")||token.equals("!")||token.equals("++")||token.equals("--")||token.equals("=")
                    ||token.equals("+=")||token.equals("-=")||token.equals("*=")
                    ||token.equals("/=")||token.equals("%=")||token.equals("&=")||token.equals("|=")
                    ||token.equals("^=")||token.equals("==")
                    ||token.equals("!=")||token.equals(">")||token.equals("<")||token.equals("&&")||token.equals("||")){
              System.out.println("operator :  "+ token);

            }
            else if(token.equals("{") ||token.equals("}") ||token.equals("(") ||token.equals(")") ||
                    token.equals("[") ||token.equals("]") ||token.equals(".") ||token.equals(":") ||
                    token.equals(",") ||token.equals(";") ||token.equals("?") ){
            
            System.out.println("special character :  "+token);
            }

            else if( token.matches("//[!@#$%^&*()_+-{}:;<,>.?/|/*-+]*[0-9]*[!@#$%^&*()_+-{}:;<,>.?/|/*-+]*[a-zA-Z]*"
                    + "[!@#$%^&*()_+-{}:;<,>.?/|/*-+]*[0-9]*[!@#$%^&*()_+-{}:;<,>.?/|/*-+]*[a-zA-Z]*[!@#$%^&*()_+-{}:;<,>.?/|/*-+]*")){
            
            System.out.println("comment :  "+token);
            }
            else if(token.matches("[0-9]*[.]*[0-9]*")){
            
            System.out.println("numeric constant :  "+token);
            }
        
        
    }
    
}
}