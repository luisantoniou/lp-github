#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int heap[80];
 
 
 typedef struct dados{
char variavel[20];
int endereco;
}stack;

stack endstack[20];
 
int controle(int qualtipo,int tamanho, int * endsave){
	int i=0,controle=0,j,end,abelha=0;
	int caseg=0;
	switch(qualtipo){
		
		case 0:
		while(i != 80){
			while(heap[i] == 0){
			i++;
			controle++;
			if(controle==tamanho+1){
				j=i-(tamanho+1);
		 	    end=j;
			    heap[j]=tamanho;
			    j++;
				for(j;j<i;j++){
					heap[j]=1;
				}
			/*	while(heap[i] == 0 && i!=80){
					i++;
				}
				inicio.quantidade=i-inicio.endereco;*/
				return end;
			}
		  }
		  controle=0;
		  i++;
		}
		break;
		
		case 1:
			controle=0;
			i = *endsave;
		while(abelha != 80){
			if(i==80){
				i=0;
			}
			while(heap[i] == 0){
			i++;
			controle++;
			
			if(controle==tamanho+1){
				if(caseg==0){
				j=i-(tamanho+1);
				}else{
					j=caseg;
				}
		 	    end=j;
			    heap[j]=tamanho;
			    j++;
				for(j;j<i;j++){
					heap[j]=1;
				}
				*endsave=j;
				return end;
			}
			if(i==80){
				caseg=i-controle;
				i=0;	
			}
		  }
		  caseg=0;
		  controle=0;
		  abelha++;
		}
		break;
		
		case 2:
		break;
		case 3:
		break;
	}
	
	
}

void remover(int end,int qualtipo){
	int i=heap[end];
	i++;
	
	switch (qualtipo){
		
	case 0:
	while(i!=0){
	      heap[end]=0;
	      i--;
	      end++;
	}
	break;
	
	case 1:
	while(i!=0){
		if(end==80){
			end=0;
		}
	      heap[end]=0;
	      i--;
	      end++;
	}
	break;
	
}
}

///////////////////////////////////////////

int main(int argc, char *argv[]) {

	int i,a,cotespa,np,abelha,result=0,pstack=0;
	for(i=0;i<80;i++){
		heap[i]=0;
	}
	int endsave=0;
	char str[50][50];
	char ajuda[10],novoed[10];
	char palavrasre[4][10] ={ "heap" , "new" , "del" , "exibe"};
	char estrategias[4][10] ={ "first" , "next" , "worst" , "best"};
	
	printf("qual estrategia voce que utilizar?\n");
    for (i=0;i<50;i++){
	fgets(str[i], 50, stdin);
	cotespa=0;
	while(str[i][cotespa] != ' ' && str[i][cotespa] != '\n'){
	ajuda[cotespa]=str[i][cotespa];
     cotespa++;
	}
	ajuda[cotespa]=NULL;
	np=0;
	while( np!=4 && strcmp(ajuda, palavrasre[np]) != 0){
		np++;
	}
	cotespa++;
	switch (np){
		case 0:
			    a=0;
		 		while(str[i][cotespa] != '\n'){
	            ajuda[a]=str[i][cotespa];
                cotespa++;
                a++;
	            }np=0;
	            ajuda[a]=NULL;
             	while( np!=4 && strcmp(ajuda, estrategias[np]) != 0){
	            np++;
	            }
                result=np;  
		break;
		case 1:
			a=0;
			while(str[i][cotespa] != ' '){
				
			endstack[pstack].variavel[a] =str[i][cotespa];
            cotespa++;
            a++;
            
	        }
	        endstack[pstack].variavel[a]=NULL;
	        cotespa++;
	        a=0;
	        while(str[i][cotespa] != '\n'){
			ajuda[a]=str[i][cotespa];
            cotespa++;
            a++;
	        }
	        ajuda[a]=NULL;
	        a = atoi(ajuda);
	        endstack[pstack].endereco=controle(result,a,&endsave);// deve retornar o primeiro endereço
			pstack++;	
		break;	
		case 2:
			a=0;
			while(str[i][cotespa] != '\n'){
	        ajuda[a]=str[i][cotespa];
                cotespa++;
                a++;
	        }
	        ajuda[a]=NULL;
	        abelha=0;
			while(strcmp(ajuda,endstack[abelha].variavel) != 0){
				abelha++;
			}
			remover(endstack[abelha].endereco,result);
			
		break;	
		case 3:
		break;
		case 4:
			while(str[i][cotespa] == ' ' || str[i][cotespa] == '='){
			cotespa++;	
			}
			a=0;
			while(str[i][cotespa] != '\n'){
	        novoed[a]=str[i][cotespa];
                cotespa++;
                a++;
	        }
	        novoed[a]=NULL;
	        abelha=0;
	        int j=-1,n=-1;
	        while(j==-1 || n==-1){
	        	if(strcmp(ajuda,endstack[abelha].variavel)  == 0 ){
	        		j=abelha;
				}
				if(strcmp(novoed,endstack[abelha].variavel)  == 0 ){
	        		n=abelha;
				}
				abelha++;
			}
			endstack[j].endereco=endstack[n].endereco;
		break;			
	}
	for(abelha=0;abelha<80;abelha++){
		printf("%i",heap[abelha]);
	}
	printf("\n");
	}
}
