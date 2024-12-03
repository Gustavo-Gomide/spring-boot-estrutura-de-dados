import matplotlib.pyplot as plt

# Dados para o gráfico
algoritmos = ['Selection Sort', 'Merge Sort']
complexidade_espaco = [1, 'n']  # O(1) e O(n)

# Convertendo as complexidades para números para o gráfico
complexidade_numerica = [1, 10]  # Escala arbitrária para demonstrar

# Criando o gráfico
plt.bar(algoritmos, complexidade_numerica, color=['blue', 'orange'])

# Adicionando rótulos e título
plt.title('Comparação da Complexidade de Espaço')
plt.ylabel('Complexidade (em termos de Big-O)')
plt.text(0, 1, 'O(1)', ha='center', color='white', fontsize=10)  # Rótulo O(1)
plt.text(1, 10, 'O(n)', ha='center', color='white', fontsize=10)  # Rótulo O(n)

# Exibindo o gráfico
plt.show()
