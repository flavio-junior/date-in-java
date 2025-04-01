# Trabalhando com datas em Java

***Data-hora local:***
```java
LocalDate
LocalDateTime
```

***Data-hora global:***
```java
Instant
```

***Duração:***
```java
Duration
```

***Outros:***
```java
Zoneid
ChronoUnit
```

***Instanciar data local:***
```java
LocalDate date = LocalDate.now();
```

***Repassar String para LocalDate:***
```java
LocalDate localDate = LocalDate.parse("2020-12-02");
```

***Instanciar data-hora local:***
```java
LocalDateTime dateTime = LocalDateTime.now();
```

***Repassar String para LocalDateTime:***
```java
LocalDateTime localDateTime = LocalDateTime.parse("2020-12-13T01:00:00");
```

***Instanciar data-hora Global com o horário padrão de Londres | GMT:***
```java
Instant instant = Instant.now();
```

***Repassar String para Instant:***
```java
Instant instant = Instant.parse("2020-12-13T01:00:00z");
```

***Repassar String para o Instant GMT de São Paulo:***
```java
Instant instantUTC = Instant.parse("2020-12-13T01:00:00-03:00");
```

***Instanciando data com formato específico:***
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate localDate = LocalDate.parse("20/07/2022", formatter);
System.out.println(localDate);
```

> Para formatos específicos, é necessário criar um formato compátivel com o formato da data em questão.

***Instanciando data com formato LocalDate:***
```java
LocalDate date = LocalDate.of(2023, 8, 8);
```

***Instanciando data com formato LocalDateTime:***
```java
LocalDateTime date = LocalDateTime.of(2023, 8, 8, 6, 43);
```

***Convertendo data local para texto:***
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println(LocalDate.now().format(formatter));
```

***Convertendo data local para texto com format:***
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println(formatter.format(LocalDate.now()));
```

***Convertendo data e hora local para texto:***
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
System.out.println(LocalDateTime.now().format(formatter));
```

***Convertendo data com GMT para o formato de texto:***
```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
System.out.println(formatter.format(Instant.now()));
```

***Utilizando formatter padrão do DateTimeFormatter:***
```java
DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
System.out.println(formatter.format(LocalDate.now()));
```

***Listar Time-Zone disponíveis:***
```java
for(String s: ZoneId.getAvailableZoneIds()){
  System.out.println(s);
}
```

***Ajustar data com Time-Zone de uma região especifica:***
```java
LocalDate localDate = LocalDate.ofInstant(Instant.now(), ZoneId.of("Pacific/Guadalcanal"));
System.out.println(localDate);
```

***Converter Data Global em uma Data Local:***
```java
LocalDate localDate = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
System.out.println(localDate);
```

***Recuperar dia da semana:***
```java
System.out.println(LocalDate.now().getDayOfWeek());
```

***Recuperar dia do mês:***
```java
System.out.println(LocalDate.now().getDayOfMonth());
System.out.println(LocalDate.now().getMonthValue());
```

***Recuperar nome do mês:***
```java
System.out.println(LocalDate.now().getMonth());
```

***Recuperar ano:***
```java
System.out.println(LocalDate.now().getYear());
```

***Recuperar dia do ano:***
```java
System.out.println(LocalDate.now().getDayOfYear());
```

***Recuperar hora:***
```java
System.out.println(LocalDateTime.now().getHour());
```

***Recuperar minutos:***
```java
System.out.println(LocalDateTime.now().getMinute());
```

***Recuperar segundos:***
```java
System.out.println(LocalDateTime.now().getSecond());
```

***Diminuir um dia:***
```java
LocalDate localDate = LocalDate.now();
LocalDate day = localDate.minusDays(3);
System.out.println(day);
```

***Diminuir um Mês:***
```java
LocalDate localDate = LocalDate.now();
LocalDate month = localDate.minusMonths(3);
System.out.println(month);
```


***Diminuir um Ano:***
```java
LocalDate localDate = LocalDate.now();
LocalDate year = localDate.minusYears(3);
System.out.println(year);
```

***Aumentar um dia:***
```java
LocalDate localDate = LocalDate.now();
LocalDate plusDay = localDate.plusDays(3);
System.out.println(plusDay);
```

***Aumentar um Mês:***
```java
LocalDate localDate = LocalDate.now();
LocalDate plusMonth = localDate.plusMonths(3);
System.out.println(plusMonth);
```


***Aumentar um Ano:***
```java
LocalDate localDate = LocalDate.now();
LocalDate plusYear = localDate.plusYears(3);
System.out.println(plusYear);
```

***Calculando a diferença entre datas:***
```java
LocalDateTime localDate = LocalDateTime.now().minusHours(5);
LocalDateTime actual = LocalDateTime.now();
Duration duration = Duration.between(localDate, actual);
System.out.println(duration.toHours());
```
