/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empreendoville;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas.sbpaixao
 */
public class EmpreendoVille {

    static int admClassica;
    static int admCientifica;
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();
    static int tipoPersonagem;

    public static void main(String[] args) {
        String[] opcao = new String[2];
        String resp = "";
        do {
            mostraDesenho();
            mostrarMenu();
            int opcaoMenu = s.nextInt();

            switch (opcaoMenu) {
                case 1:
                    mostrarHistoria();
                    opcao = criarPersonagem();

                    String nomePersonagem = opcao[0];
                    tipoPersonagem = Integer.parseInt(opcao[1]);

                    switch (tipoPersonagem) {
                        case 1:
                            perguntasAnimais(nomePersonagem);
                            break;
                        case 2:
                            perguntasHumanos(nomePersonagem);
                            break;
                    }
                    break;

                case 2:
                    lerCsv();
                    break;

                case 3:
                    System.exit(0);
                    break;

            }
            System.out.println("");
            System.out.println("===================================================================================================================================");
            System.out.println("");

            System.out.print("Deseja voltar ao menu inicial? (S) para SIM (N) para não: ");
            resp = s.next();
            System.out.println("\n\n\n");
        } while (resp.toUpperCase().equals("S"));
    }

    private static void mostraDesenho() {

        System.out.println("        EMPREENDOVILLE        ");

        System.out.println(" _____________   _____________");
        System.out.println(" |  HUMANOS  |   |  ANIMAIS  |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" | ▀  ▀  ▀ |   | ▀  ▀  ▀ |");
        System.out.println(" |    ╔╗    |   |    ╔╗    |");
        System.out.println(" |    ║║    |   |    ║║    |");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("");
        System.out.println("");

    }

    private static void mostrarMenu() {
        System.out.println("|===============================|");
        System.out.println("|         EMPREENDOVILLE        |");
        System.out.println("|===============================|");
        System.out.println("| 1 - Novo Jogo                 |");
        System.out.println("| 2 - Ver pontuações            |");
        System.out.println("| 3 - Sair                      |");
        System.out.println("| ==============================|");
        System.out.println("");
        System.out.print("Informe a opção desejada: ");

    }

    private static void mostrarHistoria() {

        System.out.println("");
        System.out.println("");
        System.out.println("Contexto:");
        System.out.println("");
        System.out.println("• A história se inicia quando os animais tomaram conta do mundo,\n"
                + "onde os animais evoluíram antes dos humanos. Os animais agora são\n"
                + "o dono do mundo com suas empresas, entretanto os humanos não queriam\n"
                + "ser tratados diferentes e inferiores e começaram a desenvolver suas\n"
                + "próprias tecnologias e conhecimentos, começando a guerra fria entre\n"
                + "animais e humanos. O jogo se passa no contexto da guerra fria entre\n"
                + "ambos, onde apenas um deles saira vencedor. Os animais fizeram um\n"
                + "contrato com os humanos, na qual iriam lhe dar uma empresa para recuperar,\n"
                + "se isso fosse feito, os humanos e os animais seriam iguais na terra de\n"
                + "EmpreendoVille, se não, os animais mandariam em EmpreendoVille e os humanos\n"
                + "voltariam a ser escravos dos animais. Para se vencer o jogo seu patrimonio tem\n"
                + "que ser igual ou maior que 6000.\n");

        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        s.next();

        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
    }

    private static String[] criarPersonagem() {

        String[] opcao = new String[2];

        System.out.println("|================================|");
        System.out.println("|        Criar Personagem        |");
        System.out.println("|================================|");
        System.out.println("|================================|");
        System.out.println("|                                |");
        System.out.println("|       Nome Personagem          |");
        System.out.println("|                                |");
        System.out.println("|================================|");
        System.out.print("Informe seu nome: ");
        opcao[0] = s.next();
        System.out.println("|================================|");
        System.out.println("|                                |");
        System.out.println("|       Tipo Personagem          |");
        System.out.println("|                                |");
        System.out.println("|================================|");
        System.out.println("|1 - Animal                      |");
        System.out.println("|2 - Humano                      |");
        System.out.println("|================================|");
        System.out.print("Informe o tipo do personagem: ");
        opcao[1] = s.next();

        if (opcao[0].equals("Bettina")) {
            System.out.println("Olá você já possui 1 milhão e 42 mil de patrimônio acumulado e não precisa de empresas");
            System.out.println("VLW FLW KKKKKKKKKKKK");
            System.exit(0);
        }

        return opcao;

    }

    private static void perguntasAnimais(String nomePersonagem) {
        int pontuacao;
        int patrimonio = 10000;

        System.out.println("");
        System.out.println("Olá " + nomePersonagem + ", sou o gato Felix, seu  analista de desempenho dos funcionários,\n"
                + "meu objetivo é te ajudar a manter a produtividade da empresa.\n"
                + "No momento, no setor de T.I, temos um porco muito promissor que está se destacando entre os demais.\n"
                + "Porém, ele não está de acordo com seu salário e seu cargo na empresa, ele pede uma oportunidade de subir de cargo e um aumento.     \n"
                + "\n"
                + "Você está disposto a aceitar essa proposta:\n"
                + "\n"
                + "1)	Aceitar\n"
                + "2)	Recusar");

        System.out.print("R: ");
        int resposta = s.nextInt();
        System.out.println("");
        switch (resposta) {
            case 1:

                pontuacao = r.nextInt(700);

                admClassica++;
                patrimonio -= pontuacao;

                System.out.println("\nAo tomar essa decisão você teve prejuizo de R$ " + pontuacao);

                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
            case 2:

                admCientifica++;
                System.out.println("\nPatrimonio: R$ " + patrimonio);

                break;

            default:
                System.out.println("Ao colocar uma alternativa errada você terá um prejuizo de 1000 reais");
                patrimonio -= 1000;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }

        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        s.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");
        System.out.println("Olá " + nomePersonagem + ", sou Falcão do RA (Recursos Animais), pensando em melhorar a produtividade,\n"
                + "tivemos uma ideia no setor de RA de criar Cursos Profissionalizantes \n"
                + "para nossos funcionários se aperfeiçoarem em sua determinada área.\n"
                + "\n"
                + "Você está disposto a aceitar essa proposta:\n"
                + " \n"
                + "1) Aceitar (Perda de R$1.000, porém, aumento em produtividade)\n"
                + "2) Recusar (Perda de produtividade)");

        System.out.print("R: ");
        resposta = s.nextInt();
        System.out.println("");

        switch (resposta) {
            case 1:

                admClassica++;

                patrimonio = patrimonio - 1000;
                pontuacao = r.nextInt(2000);
                patrimonio += pontuacao;
                System.out.println("\nAo tomar essa decisão você teve lucro de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
            case 2:

                admCientifica++;

                pontuacao = r.nextInt(2000);
                patrimonio -= pontuacao;
                System.out.println("\nAo tomar essa decisão você teve prejuizo de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);
                break;

            default:
                System.out.println("Ao colocar uma alternativa errada você terá um prejuizo de 1000 reais");

                patrimonio -= 1000;

                System.out.println("\nPatrimonio: R$ " + patrimonio);

                break;
        }

        System.out.println("");

        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        s.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");

        System.out.println("Eae chefia, eu sou do setor de montagem e meu nome é Wanderson o cachorro,\n"
                + "to passando aqui só pra te dar uma ideia pra melhorar no processo de montagem lá sabe...\n"
                + "\n"
                + "Está disposto a ouvir a proposta de Wanderson?\n"
                + "\n"
                + "1) Sim\n"
                + "2) Não");

        System.out.print("R: ");
        resposta = s.nextInt();
        System.out.println("");

        switch (resposta) {

            case 2:
                admCientifica++;
                System.out.println("\nPatrimonio: R$ " + patrimonio);
                break;

            case 1:

                admClassica++;

                System.out.println("...as maquinas se posicionam em um lugar muito alto e "
                        + "\nisso faz a gente ficar com fadiga nos braços bem rápido e assim não conseguimos ter total desempenho."
                        + "\nO senhor poderia deixar as maquinas um pouco mais baixas?\n"
                        + "\n"
                        + "1)	Aceitar proposta de Wanderson \n"
                        + "2)	Recusar proposta de Wanderson ");
                System.out.print("R: ");
                resposta = s.nextInt();

                if (resposta == 1) {
                    pontuacao = r.nextInt(10000);
                    patrimonio += pontuacao;
                    System.out.println("\nAo tomar essa decisão você teve lucro de R$ " + pontuacao);
                    System.out.println("Patrimonio: R$ " + patrimonio);

                } else {
                    System.out.println("Tudo bem chefe obrigado pela atenção!");
                    System.out.println("Patrimonio: R$ " + patrimonio);
                }
                break;
            default:
                System.out.println("Ao colocar uma alternativa errada você terá um prejuizo de 1000 reais");
                patrimonio -= 1000;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

        }
        System.out.println("");
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        s.next();

        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");

        System.out.println("Patrimonio: R$ " + patrimonio);

        System.out.println("Percebemos que um de nossos funcionários está tendo problemas com pulgas e isso está influenciando no seu trabalho\n"
                + "\n"
                + "Como deseja lidar com a situação?\n"
                + "\n"
                + "1)	Demitir funcionário \n"
                + "2)	Encaminha-lo para um tratamento");

        System.out.print("R: ");
        resposta = s.nextInt();
        System.out.println("");

        switch (resposta) {
            case 1:
                admCientifica++;
                pontuacao = r.nextInt(2000);
                patrimonio += pontuacao;
                System.out.println("\nAo tomar essa decisão você teve lucro de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
            case 2:
                admClassica++;
                pontuacao = r.nextInt(2000);
                patrimonio -= pontuacao;
                System.out.println("\nAo tomar essa decisão você teve prejuizo de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);
                break;

            default:
                System.out.println("Ao colocar uma alternativa errada você terá um prejuizo de 1000 reais");
                patrimonio -= 1000;
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }

        System.out.println("");
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        s.next();

        do {

            System.out.println("");
            System.out.println("===================================================================================================================================");
            System.out.println("");

            System.out.println("Ola " + nomePersonagem + ", sou a Raposa Dora do departamento de contabilidade, percebemos que você tem gastado muito com fornecedores,\n"
                    + "pensando nisso eu encontrei uma solução para o problema.\n"
                    + "Tive a ideia de trocarmos os produtos naturais por produtos sucintos pois isso reduziria o custo de produção.\n"
                    + "\n"
                    + "Como deseja lidar com a situação?\n"
                    + "\n"
                    + "1)	 Começar a produzir produtos sucintos.\n"
                    + "2)	 Continuar gastando com fornecedores.");

            System.out.print("R: ");
            resposta = s.nextInt();
            System.out.println("");

            switch (resposta) {

                case 1:

                    do {
                        System.out.println("");
                        System.out.println("===================================================================================================================================");
                        System.out.println("");

                        System.out.println("CHEFEEEEEEEE!!! Houve uma denúncia de nossos arqui-inimigos (Humanos) negligenciando a qualidade de nossos produtos,\n"
                                + "e a vigilância sanitária iniciou o processo para investigação do nosso estoque amanhã de manhã.\n "
                                + "Sabemos que possuímos produtos sintéticos por isso levaremos uma punição severa. \n"
                                + "\n"
                                + "E agora como você vai sair dessa?\n"
                                + "\n"
                                + "1)	Queimar estoque (Prejuízo de 75%)\n"
                                + "2)	Receber a punição (Valor indefinido)\n"
                                + "3)	Vender o estoque (Possível prejuízo/ Possível lucro)");

                        System.out.print("R: ");
                        resposta = s.nextInt();
                        System.out.println("");

                        switch (resposta) {
                            case 1:
                                patrimonio -= 75 * patrimonio / 100;
                                System.out.println("\nAo tomar essa decisão você teve um prejuizo de 75%");

                                if (patrimonio >= 6000) {

                                    System.out.println("Parabens!!! Mesmo queimando o estoque você conseguiu manter a empresa em boas condições.");
                                    System.out.println("\nPatrimonio: R$" + patrimonio);
                                } else {

                                    System.out.println("Poxa vida!!! Infelizmente ao você tomar a decisão de queimar o estoque\n"
                                            + "a empresa acabou tendo um rombo financeiro muito grande e não conseguiu se manter.");
                                    System.out.println("\nPatrimonio: R$ " + patrimonio);
                                }

                                verificaAdm();

                                break;

                            case 2:

                                patrimonio -= 2000000;
                                System.out.println("\nAo tomar essa decisão você teve um prejuizo de R$ 2.000.000");

                                if (patrimonio >= 6000) {

                                    System.out.println("Parabens!!! Quem diria, nem eu sabia que era possivel conseguir se manter depois disso.");
                                    System.out.println("\nPatrimonio: R$ " + patrimonio);

                                } else {

                                    System.out.println("Poxa vida!!! Infelizmente a multa era muito alta e você não tinha o dinheiro suficiente para quitar a divida.");
                                    System.out.println("\nPatrimonio: R$ " + patrimonio);
                                }
                                verificaAdm();

                                break;
                            case 3:
                                boolean decisao = r.nextBoolean();

                                if (decisao) {
                                    patrimonio += r.nextInt(60000);

                                } else {
                                    patrimonio = 0;
                                }

                                if (patrimonio >= 6000) {

                                    System.out.println("Parabens!!! Mesmo com o risco de tudo dar errado vocÊ conseguiu contornar a situação e se dar bem.");
                                    System.out.println("\nPatrimonio: R$ " + patrimonio);
                                } else {

                                    System.out.println("Poxa vida!!! Infelizmente as coisas não deram certo e você acabou perdendo todo seu patrimonio.");
                                    System.out.println("\nPatrimonio: R$ " + patrimonio);
                                }
                                verificaAdm();
                                break;

                            default:
                                System.out.println("\nResposta Invalida!!!");

                        }

                    } while (resposta != 1 && resposta != 2 && resposta != 3);
                    break;

                case 2:

                    do {

                        System.out.println("");
                        System.out.println("===================================================================================================================================");
                        System.out.println("");

                        System.out.print("Senhor(a) " + nomePersonagem + " a Nestete está nos precionando para termos resultados e vencer os humanos,\n"
                                + "porém isso não é possivel se a gente continuar gastando com os fornecedores nós não vamos conseguir fazer isso.\n"
                                + "\n"
                                + "E agora como você vai sair dessa?\n"
                                + "\n"
                                + "1)	Aumentar a produção fazendo os funcionarios trabalhar 16 horas por dia (grandes chances de processos trabalhistas).\n"
                                + "2)	Fechar sua empresa e deixar os humanos ganhar."
                                + "\nR: ");

                        resposta = s.nextInt();
                        System.out.println("");

                        switch (resposta) {
                            case 1:

                                pontuacao = r.nextInt(20000);

                                patrimonio -= pontuacao;
                                System.out.println("Você teve um prjuizo de R$ " + pontuacao + " por conta dos processos recebidos.");

                                if (patrimonio >= 6000) {

                                    System.out.println("Parabens!!! Mesmo as multas você conseguiu manter a empresa viva.");
                                    System.out.println("\nPatrimonio: R$ " + patrimonio);
                                } else {

                                    System.out.println("Poxa vida!!! Infelizmente as multas se tornaram em um rombo financeiro irreversivel.");
                                    System.out.println("\nPatrimonio: R$ " + patrimonio);
                                }

                                verificaAdm();

                                break;

                            case 2:

                                if (patrimonio >= 6000) {

                                    System.out.println("Parabens!!! Você conseguiu cumprir o objetivo de terminar com R$ 6000 de patrimonio, porem você perdeu a guerra contra os humanos.");
                                    System.out.println("\nPatrimonio: R$ " + patrimonio);
                                } else {

                                    System.out.println("Poxa vida!!! Você não conseguiu cumprir o objetivo de terminar com R$ 6000 de patrimonio e tambem perdeu a guerra contra os humanos.");
                                    System.out.println("\nPatrimonio: R$ " + patrimonio);
                                }

                                verificaAdm();

                                break;

                            default:
                                System.out.println("\nResposta Invalida!!!");
                        }

                    } while (resposta != 1 && resposta != 2);
                    break;

                default:
                    System.out.println("Resposta Inválida!!!");
            }

        } while (resposta != 1 && resposta != 2);

        gravarCsv(nomePersonagem, patrimonio);

    }

    private static void perguntasHumanos(String nomePersonagem) {
        int pontuacao;
        int patrimonio = 10000;

        System.out.println("");
        System.out.println("Olá " + nomePersonagem + " sou Matheus, gerente de RH. O Daniel que trabalha na manutenção, está tendo problemas com depêndencias quimicas.\n"
                + "Por conta de um térmido de relacionamento. Por conta disso seu rendimento caiu desde então. Como deseja lidar com a situação?");
        System.out.println("");
        System.out.println("1) Conversar pessoalmente com o Daniel");
        System.out.println("2) Cobrar Daniel");
        System.out.print("R:");
        int resposta = s.nextInt();

        switch (resposta) {
            case 1:
                admClassica++;
                pontuacao = r.nextInt(1000);
                patrimonio += pontuacao;
                System.out.println("\nAo tomar essa decisão você teve lucro de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 2:
                admCientifica++;
                System.out.println("\nPatrimonio: R$ " + patrimonio);

                break;
        }
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        s.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");

        System.out.println("");
        System.out.println("Olá " + nomePersonagem + " Sou Micaella do setor de finanças, o banco acabou de ligar e você precisa"
                + "\nir lá urgentemente resolver um problema!!! Entretanto tem uma operação menos importante ocorrendo em outro"
                + "\nsetor e você precisa resolver tambem."
                + "\nO que deseja fazer?");
        System.out.println("");
        System.out.println("1) Ir para o imprevisto do banco e deixar a finalização da outra operação nas mãos de um estagiario.");
        System.out.println("2) Escolher resolver a operação e adiar o imprevisto do banco.");
        System.out.print("R:");
        resposta = s.nextInt();

        switch (resposta) {
            case 1:
                admClassica++;
                pontuacao = r.nextInt(2000);
                patrimonio += pontuacao;
                System.out.println("\nAo tomar essa decisão você teve lucro de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 2:
                admCientifica++;
                pontuacao = r.nextInt(3000);
                pontuacao -= pontuacao;
                System.out.println("\nAo tomar essa decisão você teve prejuizo de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        s.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");

        System.out.println("");
        System.out.println("Chefe, precisamos urgente de fazer melhoras no setor de produção, mas não temos boas ideias de como fazer isso.\n"
                + "Está na hora de você tomar a decisão final!");
        System.out.println("");
        System.out.println("1) Buscar metodos na internet testados e outras empresas");
        System.out.println("2) Perguntar aos fúncionarios do setor de produção");
        System.out.println("3) Ignorar essa decisão");
        System.out.print("R:");
        resposta = s.nextInt();

        switch (resposta) {

            case 1:
                admCientifica++;
                pontuacao = r.nextInt(3000);
                pontuacao -= pontuacao;
                System.out.println("\nAo tomar essa decisão você teve prejuizo de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 2:
                admClassica++;
                pontuacao = r.nextInt(3000);
                patrimonio += pontuacao;
                System.out.println("\nAo tomar essa decisão você teve lucro de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 3:
                admCientifica++;
                pontuacao = r.nextInt(4000);
                pontuacao -= pontuacao;
                System.out.println("\nAo tomar essa decisão você teve prejuizo de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }
        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        s.next();
        System.out.println("");
        System.out.println("===================================================================================================================================");
        System.out.println("");
        System.out.println("Patrimonio: R$ " + patrimonio);
        System.out.println("");

        System.out.println("");
        System.out.println("Chefe em nosso departamento de programação, os trainees estão indo muito bem.\n"
                + "E estão criando várias tecnologias que estão melhorando nosso lucro. Você deseja demonstrar\n"
                + "reconhecimento de alguma forma? ");
        System.out.println("");
        System.out.println("1) Não");
        System.out.println("2) Dar aumento e reconhecimento como forma de incentivo");
        System.out.println("3) Expor para os demais funcionários");
        System.out.print("R:");
        resposta = s.nextInt();

        switch (resposta) {

            case 1:
                admCientifica++;
                pontuacao = r.nextInt(2000);
                patrimonio -= pontuacao;
                System.out.println("\nAo tomar essa decisão você teve prejuizo de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 2:
                admClassica++;
                pontuacao = r.nextInt(1000);
                patrimonio += pontuacao;
                System.out.println("\nAo tomar essa decisão você teve lucro de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;

            case 3:
                admCientifica++;
                pontuacao = r.nextInt(1000);
                patrimonio -= pontuacao;
                System.out.println("\nAo tomar essa decisão você teve prejuizo de R$ " + pontuacao);
                System.out.println("Patrimonio: R$ " + patrimonio);

                break;
        }

        System.out.println("Pressione qualquer tecla e ENTER para continuar");
        s.next();

        do {
            System.out.println("");
            System.out.println("===================================================================================================================================");
            System.out.println("");
            System.out.println("Patrimonio: R$ " + patrimonio);
            System.out.println("");

            System.out.println("");
            System.out.println("Chefe um dos funcionarios da empresa dos animais vazou uma informação para nós.\n"
                    + "E essa informação era que eles estão fazendo produtos 100% artificiais,\n"
                    + "essa informação é muito grave e cabe a você decidir oque fazer.");
            System.out.println("");
            System.out.println("1) Denunciar a empresa dos animais a vigilancia sanitaria.");
            System.out.println("2) Usar informação para chantagem (50% de chance de dar certo).");
            System.out.println("3) Expor para a midia com o risco de ter prejuizo.");
            System.out.print("R: ");
            resposta = s.nextInt();

            switch (resposta) {

                case 1:
                    if (patrimonio >= 6000) {

                        System.out.println("\nParabens!!! Você fez o certo e conseguiu manter a empresa viva, "
                                + "\n com isso você venceu a guerra.");
                        System.out.println("\nPatrimonio: R$ " + patrimonio);
                    } else {

                        System.out.println("\nParabens!!! Você fez o certo, mas nem sempre o certo te traz lucro, "
                                + "\ne por conta disso sua empresa não sobreviveu e os animais venceram a guerra.");
                        System.out.println("\nPatrimonio: R$ " + patrimonio);
                    }

                    verificaAdm();
                    break;

                case 2:
                    boolean fim = r.nextBoolean();

                    if (fim) {

                        patrimonio += r.nextInt(6000);
                        if (patrimonio >= 6000) {
                            System.out.println("\nParabens!!! você conseguiu manter sua empresa viva, "
                                    + "\nmesmo utilizando essa estrategia suja.");
                            System.out.println("\nPatrimonio: R$ " + patrimonio);
                        } else {
                            System.out.println("\nPoxa vida!!! nem usando jogo sujo você consegue ganhar.");
                            System.out.println("\nPatrimonio: R$ " + patrimonio);
                        }

                    } else {
                        patrimonio = 0;

                        System.out.println("\nOs animais não se renderam a sua chantagem e te denunciou para a policia federal."
                                + "\nA policia te prendeu e confiscou todo a patrimonio da sua empresa.");
                        System.out.println("\nPatrimonio: R$ " + patrimonio);
                    }

                    verificaAdm();

                    break;

                case 3:

                    fim = r.nextBoolean();

                    if (fim) {
                        if (patrimonio >= 6000) {

                            System.out.println("\nParabens!!! você expos a informação de forma sigilosa na imprensa, "
                                    + "\ne conseguiu manter a sua empresa viva.");
                            System.out.println("\nPatrimonio: R$ " + patrimonio);

                        } else {
                            System.out.println("\nPoxa vida!!! você expos a informação de forma sigilosa na imprensa, "
                                    + "\nporem não conseguiu manter a sua empresa viva.");
                            System.out.println("\nPatrimonio: R$ " + patrimonio);
                        }
                    } else {
                        patrimonio -= r.nextInt(6000);

                        if (patrimonio >= 6000) {

                            System.out.println("\nPutz!!! você foi exposto pelo jornalista e isso não é uma boa noticia, "
                                    + "\na sua empresa teve prejuizo, porém você conseguiu manter a empresa viva.");
                            System.out.println("\nPatrimonio: R$ " + patrimonio);
                        } else {
                            System.out.println("\nPutz!!! você foi exposto pelo jornalista e isso não é uma boa noticia, "
                                    + "\na sua empresa teve prejuizo muito alto, e você não conseguiu manter a empresa viva.");
                            System.out.println("\nPatrimonio: R$ " + patrimonio);
                        }
                    }

                    verificaAdm();

                    break;

                default:
                    System.out.println("\nResposta Invalida!!!");
            }
        } while (resposta != 1 && resposta != 2 && resposta != 3);
        gravarCsv(nomePersonagem, patrimonio);
    }

    public static void verificaAdm() {
        if (admCientifica > admClassica) {
            System.out.println("\nSua característica é forte e seu tipo de administração está baseada na administração cientifica");

        } else if (admCientifica < admClassica) {
            System.out.println("\nSua característica é forte e seu tipo de administração está baseada na administração classica");
        } else {
            System.out.println("\nNão foi possivel identificar seu estilo de administração");
        }
    }

    public static void gravarCsv(String nomePersonagem, int patrimonio) {

        try {
            String tipo = "";

            if (tipoPersonagem == 1) {
                tipo = "Animal";
            } else {
                tipo = "Humano";
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter("Pontuacoes.csv", true));

            writer.newLine();

            writer.append(nomePersonagem + ";" + patrimonio + ";" + tipo);
            writer.flush();
            writer.close();
            System.out.println("\nPontuação salva com sucesso");
        } catch (IOException ex) {
            System.out.println("Não foi possivel salvar a pontuação");
        }

    }

    public static void lerCsv() {

        try {
            File arquivo = new File("Pontuacoes.csv");
            FileReader lerArquivo = new FileReader(arquivo);
            java.io.BufferedReader ler = new java.io.BufferedReader(lerArquivo);

            String[] vetor = new String[100];
            int i = 0;

            String linha = "";
            do {

                linha = ler.readLine();
                vetor[i] = linha;

                i++;

            } while (linha != null);

            vetor[0] = vetor[0].replaceAll(";", "/");

            for (int j = 1; j < vetor.length; j++) {
                if (vetor[j] != null) {
                    vetor[j] = vetor[j].replaceAll(";", "/");
                }
            }

            System.out.println("");

            for (i = 0; i < vetor.length; i++) {
                if (vetor[i] != null) {
                    System.out.println(vetor[i]);
                }
            }
        } catch (IOException e) {
            System.out.println("Não foi possivel ler o arquivo");
        }

    }

}
