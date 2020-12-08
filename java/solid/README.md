# SOLID

### Single Responsability Principle(SRP)
```
Scenario:
Manage journal insert and remove notes. Persiste the journal into a file. 

Responsability:
- Journal: Add/Remove
- Persistence: Persist the informartion.
 
- Create a single responsability to a single class
- Easy to refeactor
- Easy to understand

Implementation: https://github.com/wescleycaldeira/design-patterns/tree/main/java/solid/src/srp
```

### Open Closed Principle(OCP)
```
Scenario:
Manage products with different colors and sizes. Filter product by color and size.

Open:
- Create new specs for filters(ColorSpecification, SizeSpecification)

Closed:
- Modify a single class for filtering products. Example: ProductFilter

- Open for extension
- Closed for modification

Implementation: https://github.com/wescleycaldeira/design-patterns/tree/main/java/solid/src/ocp
```  

### Liskov Substitution Principle(LSP)
```
Scenario:
Calculate area of a rectangle with a variation of a square

- Substitute a sub class to a base class

Implementation: https://github.com/wescleycaldeira/design-patterns/tree/main/java/solid/src/lsp
```  


