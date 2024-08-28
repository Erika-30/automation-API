# Feature: Consulta un servicio
# Este es el nombre de la característica que se está probando. Describe un grupo de escenarios relacionados.
Feature: Consulta un servicio

  # @consultaArticulos
  # Este es un tag opcional que se usa para identificar o agrupar escenarios específicos.
  # Puedes usar este tag para ejecutar solo este escenario si lo deseas.
  @consultaArticulos

  # Scenario: Consulta un servicio
  # Este es el nombre del escenario que se está probando. Cada escenario describe un caso de prueba específico.
  Scenario: Consulta un servicio

    # Given la url "https://jsonplaceholder.typicode.com" del servicio
    # Este paso configura la URL del servicio que se va a consultar.
    # Se conecta con el método `laUrlDelServicio(String url)` en la clase `ArticuloStepDef`.
    Given la url "https://jsonplaceholder.typicode.com" del servicio

    # When hago la consulta de los articulos
    # Este paso realiza la consulta de los artículos desde la URL configurada.
    # Se conecta con el método `hagoLaConsultaDeLosArticulos()` en la clase `ArticuloStepDef`.
    When hago la consulta de los articulos

    # Then imprimo los articulos
    # Este paso imprime los artículos que se obtuvieron en la consulta anterior.
    # Se conecta con el método `imprimoLosArticulos()` en la clase `ArticuloStepDef`.
    Then imprimo los articulos
