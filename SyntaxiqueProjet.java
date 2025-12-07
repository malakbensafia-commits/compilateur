public class SyntaxiqueProjet {
    
    public static String ch;
    public static int i;
    public static char tc;
    public static boolean erreur;
    
    public static void S() {
        A();
        
        if (!erreur && tc == '#') {
            System.out.println("programme Accepter");
        } else {
            System.out.println("programme erreur");
        }
    }
    
    public static void A() {
        if (tc == ' ' || tc == '\t' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
            A();
            return;
        }
        
        if (tc == '#' || tc == '}') {
            return;
        }
        
        B();
        if (!erreur) {
            A();
        }
    }
    
    public static void B() {
        if (tc == ' ' || tc == '\t' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
            B();
            return;
        }
        
        if (tc == 'w') {
            i++;
            tc = ch.charAt(i);
            if (tc == 'h') {
                i++;
                tc = ch.charAt(i);
                if (tc == 'i') {
                    i++;
                    tc = ch.charAt(i);
                    if (tc == 'l') {
                        i++;
                        tc = ch.charAt(i);
                        if (tc == 'e') {
                            i++;
                            tc = ch.charAt(i);
                            if (tc == ' ' || tc == '\t' || tc == '\n') {
                                i++;
                                tc = ch.charAt(i);
                            }
                            if (tc == '(') {
                                C();
                            } else {
                                erreur = true;
                                System.out.println("Erreur: '(' attendu apres while.");
                            }
                        } else {
                            erreur = true;
                            System.out.println("Erreur: 'e' attendu apres 'whil'.");
                        }
                    } else {
                        erreur = true;
                        System.out.println("Erreur: 'l' attendu apres 'whi'.");
                    }
                } else {
                    erreur = true;
                    System.out.println("Erreur: 'i' attendu apres 'wh'.");
                }
            } else {
                erreur = true;
                System.out.println("Erreur: 'h' attendu apres 'w'.");
            }
        }
        else if (tc == 'i') {
            i++;
            tc = ch.charAt(i);
            
            if (tc == 'f') {
                i++;
                tc = ch.charAt(i);
                if (tc == ' ' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
                if (tc == '(') {
                    D();
                } else {
                    erreur = true;
                    System.out.println("Erreur: '(' attendu apres if.");
                }
            } else if (tc == 'n') {
                i++;
                tc = ch.charAt(i);
                if (tc == 't') {
                    i++;
                    tc = ch.charAt(i);
                    if (tc == ' ' || tc == '\t' || tc == '\n') {
                        i++;
                        tc = ch.charAt(i);
                    }
                    if (tc >= 'a' && tc <= 'z' || tc >= 'A' && tc <= 'Z' || tc == '_') {
                        E();
                    } else {
                        erreur = true;
                        System.out.println("Erreur: Identificateur attendu apres 'int'.");
                    }
                } else {
                    erreur = true;
                    System.out.println("Erreur: 't' attendu apres 'in'.");
                }
            } else {
                erreur = true;
                System.out.println("Erreur: 'f' ou 'n' attendu apres 'i'.");
            }
        }
        else if (tc == 'd') {
            i++;
            tc = ch.charAt(i);
            if (tc == 'o') {
                i++;
                tc = ch.charAt(i);
                if (tc == ' ' || tc == '\t' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
                if (tc == '{') {
                    F();
                } else {
                    erreur = true;
                    System.out.println("Erreur: '{' attendu apres do.");
                }
            } else {
                erreur = true;
                System.out.println("Erreur: 'o' attendu apres 'd'.");
            }
        }
        else if (tc == 'f') {
            i++;
            tc = ch.charAt(i);
            if (tc == 'o') {
                i++;
                tc = ch.charAt(i);
                if (tc == 'r') {
                    i++;
                    tc = ch.charAt(i);
                    if (tc == ' ' || tc == '\t' || tc == '\n') {
                        i++;
                        tc = ch.charAt(i);
                    }
                    if (tc == '(') {
                        G();
                    } else {
                        erreur = true;
                        System.out.println("Erreur: '(' attendu apres for.");
                    }
                } else {
                    erreur = true;
                    System.out.println("Erreur: 'r' attendu apres 'fo'.");
                }
            } else {
                erreur = true;
                System.out.println("Erreur: 'o' attendu apres 'f'.");
            }
        }
        else if (tc >= 'a' && tc <= 'z' || tc >= 'A' && tc <= 'Z' || tc == '_') {
            H();
        }
        else if (tc == '{') {
            i++;
            tc = ch.charAt(i);
            A();
            if (tc == '}') {
                i++;
                tc = ch.charAt(i);
            } else {
                erreur = true;
                System.out.println("Erreur: '}' attendu.");
            }
        }
        else {
            erreur = true;
            System.out.println("Erreur: Instruction non reconnue.");
        }
    }
    
    public static void C() {
        if (tc == ' ' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc == '(') {
            i++;
            tc = ch.charAt(i);
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            I();
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            if (tc == ')') {
                i++;
                tc = ch.charAt(i);
                
                if (tc == ' ' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
                
                if (tc == '{') {
                    i++;
                    tc = ch.charAt(i);
                    
                    if (tc == ' ' || tc == '\n') {
                        i++;
                        tc = ch.charAt(i);
                    }
                    
                    A();
                    
                    if (tc == ' ' || tc == '\n') {
                        i++;
                        tc = ch.charAt(i);
                    }
                    
                    if (tc == '}') {
                        i++;
                        tc = ch.charAt(i);
                    } else {
                        erreur = true;
                        System.out.println("Erreur: '}' attendu apres bloc while.");
                    }
                } else {
                    erreur = true;
                    System.out.println("Erreur: '{' attendu apres condition while.");
                }
            } else {
                erreur = true;
                System.out.println("Erreur: ')' attendu apres condition while.");
            }
        } else {
            erreur = true;
            System.out.println("Erreur: '(' attendu apres while.");
        }
    }
    
    public static void D() {
        if (tc == ' ' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc == '(') {
            i++;
            tc = ch.charAt(i);
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            I();
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            if (tc == ')') {
                i++;
                tc = ch.charAt(i);
                
                if (tc == ' ' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
                
                B();
                
                if (tc == ' ' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
                
                if (tc == 'e') {
                    i++; 
                    tc = ch.charAt(i);
                    if (tc == 'l') {
                        i++; 
                        tc = ch.charAt(i);
                        if (tc == 's') {
                            i++; 
                            tc = ch.charAt(i);
                            if (tc == 'e') {
                                i++; 
                                tc = ch.charAt(i);
                                if (tc == ' ' || tc == '\n') {
                                    i++;
                                    tc = ch.charAt(i);
                                }
                                B();
                            }
                        }
                    }
                }
            } else {
                erreur = true;
                System.out.println("Erreur: ')' attendu apres condition if.");
            }
        } else {
            erreur = true;
            System.out.println("Erreur: '(' attendu apres if.");
        }
    }
    
    public static void F() {
        if (tc == ' ' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc == '{') {
            i++;
            tc = ch.charAt(i);
            
            A();
            
            if (tc == '}') {
                i++;
                tc = ch.charAt(i);
                
                if (tc == ' ' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
                
                if (tc == 'w') {
                    i++; 
                    tc = ch.charAt(i);
                    if (tc == 'h') {
                        i++; 
                        tc = ch.charAt(i);
                        if (tc == 'i') {
                            i++; 
                            tc = ch.charAt(i);
                            if (tc == 'l') {
                                i++; 
                                tc = ch.charAt(i);
                                if (tc == 'e') {
                                    i++; 
                                    tc = ch.charAt(i);
                                    if (tc == ' ' || tc == '\n') {
                                        i++;
                                        tc = ch.charAt(i);
                                    }
                                    if (tc == '(') {
                                        i++; 
                                        tc = ch.charAt(i);
                                        if (tc == ' ' || tc == '\n') {
                                            i++;
                                            tc = ch.charAt(i);
                                        }
                                        I();
                                        if (tc == ' ' || tc == '\n') {
                                            i++;
                                            tc = ch.charAt(i);
                                        }
                                        if (tc == ')') {
                                            i++; 
                                            tc = ch.charAt(i);
                                            if (tc == ' ' || tc == '\n') {
                                                i++;
                                                tc = ch.charAt(i);
                                            }
                                            if (tc == ';') {
                                                i++;
                                                tc = ch.charAt(i);
                                            } else {
                                                erreur = true;
                                                System.out.println("Erreur: ';' attendu apres condition do-while.");
                                            }
                                        } else {
                                            erreur = true;
                                            System.out.println("Erreur: ')' attendu apres condition do-while.");
                                        }
                                    } else {
                                        erreur = true;
                                        System.out.println("Erreur: '(' attendu apres while dans do-while.");
                                    }
                                } else {
                                    erreur = true;
                                    System.out.println("Erreur: 'e' attendu apres 'whil' dans do-while.");
                                }
                            } else {
                                erreur = true;
                                System.out.println("Erreur: 'l' attendu apres 'whi' dans do-while.");
                            }
                        } else {
                            erreur = true;
                            System.out.println("Erreur: 'i' attendu apres 'wh' dans do-while.");
                        }
                    } else {
                        erreur = true;
                        System.out.println("Erreur: 'h' attendu apres 'w' dans do-while.");
                    }
                } else {
                    erreur = true;
                    System.out.println("Erreur: 'w' attendu apres bloc do.");
                }
            } else {
                erreur = true;
                System.out.println("Erreur: '}' attendu apres bloc do.");
            }
        } else {
            erreur = true;
            System.out.println("Erreur: '{' attendu apres do.");
        }
    }
    
    public static void G() {
        if (tc == ' ' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc == '(') {
            i++;
            tc = ch.charAt(i);
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            if (tc != ';') {
                J();
            }
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            if (tc == ';') {
                i++;
                tc = ch.charAt(i);
                
                if (tc == ' ' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
                
                if (tc != ';') {
                    I();
                }
                
                if (tc == ' ' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
                
                if (tc == ';') {
                    i++;
                    tc = ch.charAt(i);
                    
                    if (tc == ' ' || tc == '\n') {
                        i++;
                        tc = ch.charAt(i);
                    }
                    
                    if (tc != ')') {
                        J();
                    }
                    
                    if (tc == ' ' || tc == '\n') {
                        i++;
                        tc = ch.charAt(i);
                    }
                    
                    if (tc == ')') {
                        i++;
                        tc = ch.charAt(i);
                        
                        if (tc == ' ' || tc == '\n') {
                            i++;
                            tc = ch.charAt(i);
                        }
                        
                        if (tc == '{') {
                            i++;
                            tc = ch.charAt(i);
                            
                            if (tc == ' ' || tc == '\n') {
                                i++;
                                tc = ch.charAt(i);
                            }
                            
                            A();
                            
                            if (tc == ' ' || tc == '\n') {
                                i++;
                                tc = ch.charAt(i);
                            }
                            
                            if (tc == '}') {
                                i++;
                                tc = ch.charAt(i);
                            } else {
                                erreur = true;
                                System.out.println("Erreur: '}' attendu apres bloc for.");
                            }
                        } else {
                            erreur = true;
                            System.out.println("Erreur: '{' attendu apres for.");
                        }
                    } else {
                        erreur = true;
                        System.out.println("Erreur: ')' attendu dans for.");
                    }
                } else {
                    erreur = true;
                    System.out.println("Erreur: ';' attendu dans for.");
                }
            } else {
                erreur = true;
                System.out.println("Erreur: ';' attendu dans for.");
            }
        } else {
            erreur = true;
            System.out.println("Erreur: '(' attendu apres for.");
        }
    }
    
    public static void I() {
        J();
        
        if (tc == ' ' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc == '<' || tc == '>' || tc == '=' || tc == '!') {
            char op = tc;
            i++;
            tc = ch.charAt(i);
            
            if (tc == '=') {
                i++;
                tc = ch.charAt(i);
            }
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            J();
        }
    }
    
    public static void J() {
        K();
        
        if (tc == ' ' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc == '+' || tc == '-') {
            i++;
            tc = ch.charAt(i);
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            K();
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
        }
    }
    
    public static void K() {
        L();
        
        if (tc == ' ' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc == '*' || tc == '/') {
            i++;
            tc = ch.charAt(i);
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            L();
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
        }
    }
    
    public static void L() {
        if (tc == ' ' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc >= 'a' && tc <= 'z' || tc >= 'A' && tc <= 'Z' || tc == '_') {
            while (tc >= 'a' && tc <= 'z' || tc >= 'A' && tc <= 'Z' || 
                   tc >= '0' && tc <= '9' || tc == '_') {
                i++;
                tc = ch.charAt(i);
            }
        }
        else if (tc >= '0' && tc <= '9') {
            while (tc >= '0' && tc <= '9') {
                i++;
                tc = ch.charAt(i);
            }
        }
        else if (tc == '(') {
            i++;
            tc = ch.charAt(i);
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            J();
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            if (tc == ')') {
                i++;
                tc = ch.charAt(i);
            } else {
                erreur = true;
                System.out.println("Erreur: ')' attendu.");
            }
        }
        else {
            erreur = true;
            System.out.println("Erreur: Facteur invalide.");
        }
    }
    
    public static void H() {
        while (tc >= 'a' && tc <= 'z' || tc >= 'A' && tc <= 'Z' || 
               tc >= '0' && tc <= '9' || tc == '_') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc == ' ' || tc == '\n') {
            i++;
            tc = ch.charAt(i);
        }
        
        if (tc == '=') {
            i++;
            tc = ch.charAt(i);
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            J();
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            if (tc == ';') {
                i++;
                tc = ch.charAt(i);
            } else {
                erreur = true;
                System.out.println("Erreur: ';' attendu apres affectation.");
            }
        } else {
            erreur = true;
            System.out.println("Erreur: '=' attendu dans affectation.");
        }
    }
    
    public static void E() {
        if (tc >= 'a' && tc <= 'z' || tc >= 'A' && tc <= 'Z' || tc == '_') {
            while (tc >= 'a' && tc <= 'z' || tc >= 'A' && tc <= 'Z' || 
                   tc >= '0' && tc <= '9' || tc == '_') {
                i++;
                tc = ch.charAt(i);
            }
            
            if (tc == ' ' || tc == '\n') {
                i++;
                tc = ch.charAt(i);
            }
            
            if (tc == '=') {
                i++;
                tc = ch.charAt(i);
                
                if (tc == ' ' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
                
                J();
                
                if (tc == ' ' || tc == '\n') {
                    i++;
                    tc = ch.charAt(i);
                }
            }
            
            if (tc == ';') {
                i++;
                tc = ch.charAt(i);
            } else {
                erreur = true;
                System.out.println("Erreur: ';' attendu apres declaration.");
            }
        } else {
            erreur = true;
            System.out.println("Erreur: Identificateur attendu apres 'int'.");
        }
    }
    
    public static void analyserSyntaxique(String A) {
        ch = A + "#";  
        i = 0;
        tc = ch.charAt(i);
        erreur = false;
            
        S();
        
        if (!erreur) {
            System.out.println(" Programme syntaxiquement correct");
        } else {
            System.out.println(" Programme contient des erreurs");
        }
    }
}