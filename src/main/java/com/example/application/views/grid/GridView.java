package com.example.application.views.grid;

import java.util.Arrays;
import java.util.List;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@SuppressWarnings("serial")
@PageTitle("Grid Demo")
@Route(value = "grid")
@RouteAlias(value = "")
public class GridView extends VerticalLayout {

  public GridView() {
    List<Person> people = Arrays.asList(
      new Person("Nicolaus Copernicus", 1543),
      new Person("Galileo Galilei", 1564),
      new Person("Johannes Kepler", 1571));

    Grid<Person> grid = new Grid<>();
    grid.setItems(people);
    grid.addColumn(Person::getName).setHeader("Name");
    grid.addColumn(Person::getYearOfBirth)
      .setHeader("Year of birth")
      .setSortable(true);
    add(grid);
  }

  static class Person {
    String name;
    int yearOfBirth;

    Person(String name, int yearOfBirth) {
      super();
      this.name = name;
      this.yearOfBirth = yearOfBirth;
    }

    int getYearOfBirth() {
      return yearOfBirth;
    }

    String getName() {
      return name;
    }
  }

}
