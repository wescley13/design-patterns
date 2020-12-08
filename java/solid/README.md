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
```

### Open Closed Principle(OCP)
```
Scenario:
Manage products with different colors and sizes. 

Open:
- Create new specs for filters(ColorSpecification, SizeSpecification)

Closed:
- Modify a single class for filter. Example: ProductFilter

- Open for extension
- Close for modification
```  


