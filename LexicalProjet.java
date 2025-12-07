import java.util.Scanner;

public class LexicalProjet {
    
    public static void analyserLexical(String A) { 
    String s = A + "#"; 
    int i = 0;
    char tc = s.charAt(i);
        
        
        while (tc != '#') {
            
       
            if (tc == 'w') {
                i++; tc = s.charAt(i);
                if (tc == 'h') {
                    i++; tc = s.charAt(i);
                    if (tc == 'i') {
                        i++; tc = s.charAt(i);
                        if (tc == 'l') {
                            i++; tc = s.charAt(i);
                            if (tc == 'e') {
                                i++; tc = s.charAt(i);
                                System.out.println("MOT_CLE : while");
                            }
                        }
                    }
                }
            }
        
            else if (tc == 'b') {
                i++; tc = s.charAt(i);
                if (tc == 'e') {
                    i++; tc = s.charAt(i);
                    if (tc == 'n') {
                        i++; tc = s.charAt(i);
                        if (tc == 's') {
                            i++; tc = s.charAt(i);
                            if (tc == 'a') {
                                i++; tc = s.charAt(i);
                                if (tc == 'f') {
                                    i++; tc = s.charAt(i);
                                    if (tc == 'i') {
                                        i++; tc = s.charAt(i);
                                        if (tc == 'a') {
                                            i++; tc = s.charAt(i);
                                            System.out.println("MOT_CLE_PERSONNALISE : bensafia");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
      
            else if (tc == 'm') {
                i++; tc = s.charAt(i);
                if (tc == 'a') {
                    i++; tc = s.charAt(i);
                    if (tc == 'l') {
                        i++; tc = s.charAt(i);
                        if (tc == 'a') {
                            i++; tc = s.charAt(i);
                            if (tc == 'k') {
                                i++; tc = s.charAt(i);
                                System.out.println("MOT_CLE_PERSONNALISE : malak");
                            }
                        }
                    }
                }
            }
     
            else if (tc == 'i') {
                i++; tc = s.charAt(i);
                if (tc == 'f') {
                    i++; tc = s.charAt(i);
                    System.out.println("MOT_CLE : if");
                }
        
                else if (tc == 'n') {
                    i++; tc = s.charAt(i);
                    if (tc == 't') {
                        i++; tc = s.charAt(i);
                        System.out.println("TYPE : int");
                    }
                }
            }
    
            else if (tc == 'e') {
                i++; tc = s.charAt(i);
                if (tc == 'l') {
                    i++; tc = s.charAt(i);
                    if (tc == 's') {
                        i++; tc = s.charAt(i);
                        if (tc == 'e') {
                            i++; tc = s.charAt(i);
                            System.out.println("MOT_CLE : else");
                        }
                    }
                }
            }
        
            else if (tc == 'd') {
                i++; tc = s.charAt(i);
                if (tc == 'o') {
                    i++; tc = s.charAt(i);
                    System.out.println("MOT_CLE : do");
                }
            }
           
            else if (tc == 'f') {
                i++; tc = s.charAt(i);
                if (tc == 'o') {
                    i++; tc = s.charAt(i);
                    if (tc == 'r') {
                        i++; tc = s.charAt(i);
                        System.out.println("MOT_CLE : for");
                    }
                }
            }
            
        
            else if (tc == 't') {
                i++; tc = s.charAt(i);
                if (tc == 'r') {
                    i++; tc = s.charAt(i);
                    if (tc == 'u') {
                        i++; tc = s.charAt(i);
                        if (tc == 'e') {
                            i++; tc = s.charAt(i);
                            System.out.println("BOOL : true");
                        }
                    }
                }
            }
       
            else if (tc == 'f') {
                i++; tc = s.charAt(i);
                if (tc == 'a') {
                    i++; tc = s.charAt(i);
                    if (tc == 'l') {
                        i++; tc = s.charAt(i);
                        if (tc == 's') {
                            i++; tc = s.charAt(i);
                            if (tc == 'e') {
                                i++; tc = s.charAt(i);
                                System.out.println("BOOL : false");
                            }
                        }
                    }
                }
            }
           
            else if (tc == 'r') {
                i++; tc = s.charAt(i);
                if (tc == 'e') {
                    i++; tc = s.charAt(i);
                    if (tc == 't') {
                        i++; tc = s.charAt(i);
                        if (tc == 'u') {
                            i++; tc = s.charAt(i);
                            if (tc == 'r') {
                                i++; tc = s.charAt(i);
                                if (tc == 'n') {
                                    i++; tc = s.charAt(i);
                                    System.out.println("MOT_CLE : return");
                                }
                            }
                        }
                    }
                }
            }
            
            else if (tc == 'b') {
                i++; tc = s.charAt(i);
                if (tc == 'r') {
                    i++; tc = s.charAt(i);
                    if (tc == 'e') {
                        i++; tc = s.charAt(i);
                        if (tc == 'a') {
                            i++; tc = s.charAt(i);
                            if (tc == 'k') {
                                i++; tc = s.charAt(i);
                                System.out.println("MOT_CLE : break");
                            }
                        }
                    }
                }
            }
           
            else if (tc == 'c') {
                i++; tc = s.charAt(i);
                if (tc == 'o') {
                    i++; tc = s.charAt(i);
                    if (tc == 'n') {
                        i++; tc = s.charAt(i);
                        if (tc == 't') {
                            i++; tc = s.charAt(i);
                            if (tc == 'i') {
                                i++; tc = s.charAt(i);
                                if (tc == 'n') {
                                    i++; tc = s.charAt(i);
                                    if (tc == 'u') {
                                        i++; tc = s.charAt(i);
                                        if (tc == 'e') {
                                            i++; tc = s.charAt(i);
                                            System.out.println("MOT_CLE : continue");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            
            
            else if (tc == 'f') {
                i++; tc = s.charAt(i);
                if (tc == 'l') {
                    i++; tc = s.charAt(i);
                    if (tc == 'o') {
                        i++; tc = s.charAt(i);
                        if (tc == 'a') {
                            i++; tc = s.charAt(i);
                            if (tc == 't') {
                                i++; tc = s.charAt(i);
                                System.out.println("TYPE : float");
                            }
                        }
                    }
                }
            }
            
           
            else if (tc == 'c') {
                i++; tc = s.charAt(i);
                if (tc == 'h') {
                    i++; tc = s.charAt(i);
                    if (tc == 'a') {
                        i++; tc = s.charAt(i);
                        if (tc == 'r') {
                            i++; tc = s.charAt(i);
                            System.out.println("TYPE : char");
                        }
                    }
                }
            }
           
            else if (tc == 's') {
                i++; tc = s.charAt(i);
                if (tc == 'w') {
                    i++; tc = s.charAt(i);
                    if (tc == 'i') {
                        i++; tc = s.charAt(i);
                        if (tc == 't') {
                            i++; tc = s.charAt(i);
                            if (tc == 'c') {
                                i++; tc = s.charAt(i);
                                if (tc == 'h') {
                                    i++; tc = s.charAt(i);
                                    System.out.println("MOT_CLE : switch");
                                }
                            }
                        }
                    }
                }
            }
            
            else if (tc == 'c') {
                i++; tc = s.charAt(i);
                if (tc == 'a') {
                    i++; tc = s.charAt(i);
                    if (tc == 's') {
                        i++; tc = s.charAt(i);
                        if (tc == 'e') {
                            i++; tc = s.charAt(i);
                            System.out.println("MOT_CLE : case");
                        }
                    }
                }
            }
           
            else if (tc == 'd') {
                i++; tc = s.charAt(i);
                if (tc == 'e') {
                    i++; tc = s.charAt(i);
                    if (tc == 'f') {
                        i++; tc = s.charAt(i);
                        if (tc == 'a') {
                            i++; tc = s.charAt(i);
                            if (tc == 'u') {
                                i++; tc = s.charAt(i);
                                if (tc == 'l') {
                                    i++; tc = s.charAt(i);
                                    if (tc == 't') {
                                        i++; tc = s.charAt(i);
                                        System.out.println("MOT_CLE : default");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            
             else if (tc == 'p') {
                i++; tc = s.charAt(i);
                if (tc == 'r') {
                    i++; tc = s.charAt(i);
                    if (tc == 'i') {
                        i++; tc = s.charAt(i);
                        if (tc == 'n') {
                            i++; tc = s.charAt(i);
                            if (tc == 't') {
                                i++; tc = s.charAt(i);
                                if (tc == 'f') {
                                    i++; tc = s.charAt(i);
                                    System.out.println("FONCTION : printf");
                                }
                            }
                        }
                    }
                }
            }
            
           
            else if (tc == 's') {
                i++; tc = s.charAt(i);
                if (tc == 'c') {
                    i++; tc = s.charAt(i);
                    if (tc == 'a') {
                        i++; tc = s.charAt(i);
                        if (tc == 'n') {
                            i++; tc = s.charAt(i);
                            if (tc == 'f') {
                                i++; tc = s.charAt(i);
                                System.out.println("FONCTION : scanf");
                            }
                        }
                    }
                }
            }
            
          
            else if (tc == 'm') {
                i++; tc = s.charAt(i);
                if (tc == 'a') {
                    i++; tc = s.charAt(i);
                    if (tc == 'i') {
                        i++; tc = s.charAt(i);
                        if (tc == 'n') {
                            i++; tc = s.charAt(i);
                            System.out.println("FONCTION : main");
                        }
                    }
                }
            }
            
          
            else if (tc == 'v') {
                i++; tc = s.charAt(i);
                if (tc == 'o') {
                    i++; tc = s.charAt(i);
                    if (tc == 'i') {
                        i++; tc = s.charAt(i);
                        if (tc == 'd') {
                            i++; tc = s.charAt(i);
                            System.out.println("TYPE : void");
                        }
                    }
                }
            }
            
       
            else if (tc == 'd') {
                i++; tc = s.charAt(i);
                if (tc == 'o') {
                    i++; tc = s.charAt(i);
                    if (tc == 'u') {
                        i++; tc = s.charAt(i);
                        if (tc == 'b') {
                            i++; tc = s.charAt(i);
                            if (tc == 'l') {
                                i++; tc = s.charAt(i);
                                if (tc == 'e') {
                                    i++; tc = s.charAt(i);
                                    System.out.println("TYPE : double");
                                }
                            }
                        }
                    }
                }
            }
            else if (tc == 'c') {
                i++; tc = s.charAt(i);
                if (tc == 'o') {
                    i++; tc = s.charAt(i);
                    if (tc == 'n') {
                        i++; tc = s.charAt(i);
                        if (tc == 's') {
                            i++; tc = s.charAt(i);
                            if (tc == 't') {
                                i++; tc = s.charAt(i);
                                System.out.println("MODIFICATEUR : const");
                            }
                        }
                    }
                }
            }
            

            else if (tc == 's') {
                i++; tc = s.charAt(i);
                if (tc == 't') {
                    i++; tc = s.charAt(i);
                    if (tc == 'a') {
                        i++; tc = s.charAt(i);
                        if (tc == 't') {
                            i++; tc = s.charAt(i);
                            if (tc == 'i') {
                                i++; tc = s.charAt(i);
                                if (tc == 'c') {
                                    i++; tc = s.charAt(i);
                                    System.out.println("MODIFICATEUR : static");
                                }
                            }
                        }
                    }
                }
            }
            
            else if (tc == 's') {
                i++; tc = s.charAt(i);
                if (tc == 'i') {
                    i++; tc = s.charAt(i);
                    if (tc == 'z') {
                        i++; tc = s.charAt(i);
                        if (tc == 'e') {
                            i++; tc = s.charAt(i);
                            if (tc == 'o') {
                                i++; tc = s.charAt(i);
                                if (tc == 'f') {
                                    i++; tc = s.charAt(i);
                                    System.out.println("OPERATEUR : sizeof");
                                }
                            }
                        }
                    }
                }
            }
        
            else if (tc == 't') {
                i++; tc = s.charAt(i);
                if (tc == 'y') {
                    i++; tc = s.charAt(i);
                    if (tc == 'p') {
                        i++; tc = s.charAt(i);
                        if (tc == 'e') {
                            i++; tc = s.charAt(i);
                            if (tc == 'd') {
                                i++; tc = s.charAt(i);
                                if (tc == 'e') {
                                    i++; tc = s.charAt(i);
                                    if (tc == 'f') {
                                        i++; tc = s.charAt(i);
                                        System.out.println("MOT_CLE : typedef");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            

         
            else if (tc == 's') {
                i++; tc = s.charAt(i);
                if (tc == 'i') {
                    i++; tc = s.charAt(i);
                    if (tc == 'z') {
                        i++; tc = s.charAt(i);
                        if (tc == 'e') {
                            i++; tc = s.charAt(i);
                            if (tc == 'o') {
                                i++; tc = s.charAt(i);
                                if (tc == 'f') {
                                    i++; tc = s.charAt(i);
                                    System.out.println("OPERATEUR : sizeof");
                                }
                            }
                        }
                    }
                }
            }
            
         
          
            
            // struct
            else if (tc == 's') {
                i++; tc = s.charAt(i);
                if (tc == 't') {
                    i++; tc = s.charAt(i);
                    if (tc == 'r') {
                        i++; tc = s.charAt(i);
                        if (tc == 'u') {
                            i++; tc = s.charAt(i);
                            if (tc == 'c') {
                                i++; tc = s.charAt(i);
                                if (tc == 't') {
                                    i++; tc = s.charAt(i);
                                    System.out.println("MOT_CLE : struct");
                                }
                            }
                        }
                    }
                }
            }
            
          else if (tc == 's') {
                i++; tc = s.charAt(i);
                if (tc == 'i') {
                    i++; tc = s.charAt(i);
                    if (tc == 'z') {
                        i++; tc = s.charAt(i);
                        if (tc == 'e') {
                            i++; tc = s.charAt(i);
                            if (tc == 'o') {
                                i++; tc = s.charAt(i);
                                if (tc == 'f') {
                                    i++; tc = s.charAt(i);
                                    System.out.println("OPERATEUR : sizeof");
                                }
                            }
                        }
                    }
                }
            }
            
            // typedef
            else if (tc == 't') {
                i++; tc = s.charAt(i);
                if (tc == 'y') {
                    i++; tc = s.charAt(i);
                    if (tc == 'p') {
                        i++; tc = s.charAt(i);
                        if (tc == 'e') {
                            i++; tc = s.charAt(i);
                            if (tc == 'd') {
                                i++; tc = s.charAt(i);
                                if (tc == 'e') {
                                    i++; tc = s.charAt(i);
                                    if (tc == 'f') {
                                        i++; tc = s.charAt(i);
                                        System.out.println("MOT_CLE : typedef");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        
         
            
           
            else if (tc == ' ' || tc == '\t' || tc == '\n') {
                i++;
                tc = s.charAt(i);
            }
            
        
            else if (tc == '=') {
                i++;
                tc = s.charAt(i);
                if (tc == '=') {
                    System.out.println("OPERATEUR : ==");
                    i++;
                    tc = s.charAt(i);
                } else {
                    System.out.println("OPERATEUR : =");
                }
            }
            
            
            else if (tc == '+') {
                System.out.println("OPERATEUR : +");
                i++;
                tc = s.charAt(i);
            }
            
            
            else if (tc == '-') {
                System.out.println("OPERATEUR : -");
                i++;
                tc = s.charAt(i);
            }
          
            else if (tc == '*') {
                System.out.println("OPERATEUR : *");
                i++;
                tc = s.charAt(i);
            }
          
            else if (tc == '/') {
                System.out.println("OPERATEUR : /");
                i++;
                tc = s.charAt(i);
            }
            
           
            else if (tc == '%') {
                System.out.println("OPERATEUR : %");
                i++;
                tc = s.charAt(i);
            }
          
            else if (tc == '<') {
                i++;
                tc = s.charAt(i);
                if (tc == '=') {
                    System.out.println("OPERATEUR : <=");
                    i++;
                    tc = s.charAt(i);
                } else {
                    System.out.println("OPERATEUR : <");
                }
            }
        
            else if (tc == '>') {
                i++;
                tc = s.charAt(i);
                if (tc == '=') {
                    System.out.println("OPERATEUR : >=");
                    i++;
                    tc = s.charAt(i);
                } else {
                    System.out.println("OPERATEUR : >");
                }
            }
          
            else if (tc == '!') {
                i++;
                tc = s.charAt(i);
                if (tc == '=') {
                    System.out.println("OPERATEUR : !=");
                    i++;
                    tc = s.charAt(i);
                } else {
                    System.out.println("OPERATEUR : !");
                }
            }
          
            else if (tc == '(') {
                System.out.println("PARENTHESE : (");
                i++;
                tc = s.charAt(i);
            }
            
            // )
            else if (tc == ')') {
                System.out.println("PARENTHESE : )");
                i++;
                tc = s.charAt(i);
            }
            
       
            else if (tc == '{') {
                System.out.println("ACCOLADE : {");
                i++;
                tc = s.charAt(i);
            }
     
            else if (tc == '}') {
                System.out.println("ACCOLADE : }");
                i++;
                tc = s.charAt(i);
            }
            
     
            else if (tc == ';') {
                System.out.println("POINT_VIRGULE : ;");
                i++;
                tc = s.charAt(i);
            }
      
            else if (tc == ',') {
                System.out.println("VIRGULE : ,");
                i++;
                tc = s.charAt(i);
            }
            
        
            else if (tc >= '0' && tc <= '9') {
                String nombre = "";
                while (tc >= '0' && tc <= '9') {
                    nombre = nombre + tc;
                    i++;
                    tc = s.charAt(i);
                }
                
              
                if ((tc >= 'a' && tc <= 'z') || (tc >= 'A' && tc <= 'Z') || tc == '_') {
                    System.out.println("ERREUR : '" + nombre + "' ne peut pas commencer un identificateur");
                } else {
                    System.out.println("NOMBRE : " + nombre);
                }
            }
           
            else if ((tc >= 'a' && tc <= 'z') || (tc >= 'A' && tc <= 'Z') || tc == '_') {
                String ident = "";
                while ((tc >= 'a' && tc <= 'z') || (tc >= 'A' && tc <= 'Z') || 
                       (tc >= '0' && tc <= '9') || tc == '_') {
                    ident = ident + tc;
                    i++;
                    tc = s.charAt(i);
                }
                System.out.println("IDENTIFICATEUR : " + ident);
            }
        
            else {
                System.out.println("CARACTERE : " + tc);
                i++;
                tc = s.charAt(i);
            }
        }
        
        System.out.println("FIN");
    }
}