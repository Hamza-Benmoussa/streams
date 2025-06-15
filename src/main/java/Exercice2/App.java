package Exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class App {
        public static void main(String[] args) {
                List<Employer> listEmployer = new ArrayList<>();
                listEmployer.add(new Employer("Ahmed", "IT", 16000));
                listEmployer.add(new Employer("Ayman", "IT", 14700));
                listEmployer.add(new Employer("Imane", "RH", 12000));
                listEmployer.add(new Employer("Fatima", "Marketing", 15000));
                listEmployer.add(new Employer("Widad", "Comptabilité", 15000));
                listEmployer.add(new Employer("Mohammed", "Comptabilité", 15000));

                System.out.println("************** Q1 *************");
                double sommeSalaire = listEmployer.stream().mapToDouble(employer -> employer.getSalaire()).sum();
                System.out.println("La somme des salaires des employés: " + sommeSalaire);

                System.out.println("************** Q2 *************");
                listEmployer.stream()
                        .sorted((employer1, employer2) -> employer1.getNom().compareTo(employer2.getNom()))
                        .toList()
                        .forEach(System.out::println);
                System.out.println("************** Q3 *************");
                Optional<Employer> minSalaire = listEmployer.stream()
                        .min((employer1, employer2) ->
                                Double.compare(employer1.getSalaire(), employer2.getSalaire())
                        );

                System.out.println("Employé(e) " + minSalaire.get().getNom() + ", a le salaire le plus bas: " + minSalaire.get().getSalaire());

                System.out.println("************** Q4 *************");
                double salair = 15000;
                System.out.println("Les emoloyés ayant un salaire superieur à " + salair + ":");
                listEmployer.stream().filter(employer -> employer.getSalaire() > salair ).toList().forEach(System.out::println);

                System.out.println("************** Q5 *************");
                Optional<Employer> maxSalaire = listEmployer.stream()
                        .reduce((employer1, employer2) -> employer1.getSalaire() > employer2.getSalaire() ? employer1 : employer2);
                System.out.println("Employé(e) " + maxSalaire.get().getNom() + ", a le salaire le plus élevé: " + maxSalaire.get().getSalaire());

                System.out.println("************** Q6 *************");
                String noms = listEmployer.stream().map(Employer::getNom).reduce("", (nom1, nom2) -> nom1 + " " + nom2);
                System.out.println("Les noms des emplyés: " + noms);
        }
}
