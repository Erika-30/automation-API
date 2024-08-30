Feature: Crear usuario PetStore

  @test1


    @crearUsuario // Este es un tag opcional que se usa para identificar o agrupar escenarios específicos.
  Scenario: Crear usuario

    When creo el usuario con username "jperez", firstname "Juan", lastname "Perez"
    Then el código de respuesta es 200
    And el type es "unknown"
