def main():
    print "\nInicio"
    existentes = [5,5,5,5]
    disponiveis = [3,2,0,2]

    alocados = [
        [1,1,3,1],
        [0,1,1,1],
        [1,1,1,1],
        [0,0,0,0]
    ]

    requisitados = [
        [1,0,2,0],
        [1,1,0,1],
        [2,1,0,1],
        [1,0,1,0]
    ]

    consultar_matrizes(existentes, disponiveis, alocados, requisitados)



def consultar_matrizes(existentes, disponiveis, alocados, requisitados):
    print "\nConsultar matrizes"


    for i in range(len(disponiveis)):
        for j in range(len(disponiveis)):
            if requisitados[j][0] <= disponiveis[0] and requisitados[j][1] <= disponiveis[1] \
                    and requisitados[j][2] <= disponiveis[2] and requisitados[j][3] <= disponiveis[3]:
                disponiveis[0] += alocados[i][0]
                disponiveis[1] += alocados[i][1]
                disponiveis[2] += alocados[i][2]
                disponiveis[3] += alocados[i][3]

                break

    consultar_deadlock(existentes, disponiveis)


def consultar_deadlock(existentes, disponiveis):

    print "\nConsultar deadlock"

    print disponiveis[0] == existentes[0]
    print disponiveis[1] == existentes[1]
    print disponiveis[2] == existentes[2]
    print disponiveis[3] == existentes[3]

    print "\nConferindo Resultado: "
    print "Disponiveis ", disponiveis[0], ",",disponiveis[1], ",",disponiveis[2], ",",disponiveis[3]
    print "Existentes ",  existentes[0], ",",existentes[1], ",",existentes[2], ",",existentes[3]

    if disponiveis[0] == existentes[0] and disponiveis[1] == existentes[1] and disponiveis[2] == existentes[2] and disponiveis[3] == existentes[3]:
        print "\nSem DeadLock"
    else:
        print "\nDeadLock"

if __name__ == "__main__":
    main()