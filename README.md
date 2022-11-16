# CSVCombiner

It takes the multiple CSV files as input, and merges them into a single file. Each CSV file (found in the fixtures directory of this repo) will have the same columns. 

New CSV file contains a new additional column called "filename" that originally belongs to.

# How to run the code

Go to bin location, and run the below command in the command prompt

```
 java $Javaclass $inputfilepath1 $inputfilepath2 $inputfilepath2 > $outputfile
```
Example:
```
$ java CodingAssesment.PMGAssignmentApp ../fixtures/accessories.csv ../fixtures/clothing.csv ../fixtures/household_cleaners.csv > combined.csv
```

Given two input files named `clothing.csv` and `accessories.csv`.

|email_hash|category|
|----------|--------|
|21d56b6a011f91f4163fcb13d416aa4e1a2c7d82115b3fd3d831241fd63|Shirts|
|21d56b6a011f91f4163fcb13d416aa4e1a2c7d82115b3fd3d831241fd63|Pants|
|166ca9b3a59edaf774d107533fba2c70ed309516376ce2693e92c777dd971c4b|Cardigans|

|email_hash|category|
|----------|--------|
|176146e4ae48e70df2e628b45dccfd53405c73f951c003fb8c9c09b3207e7aab|Wallets|
|63d42170fa2d706101ab713de2313ad3f9a05aa0b1c875a56545cfd69f7101fe|Purses|

output will look like:

|email_hash|category|filename|
|----------|--------|--------|
|21d56b6a011f91f4163fcb13d416aa4e1a2c7d82115b3fd3d831241fd63|Shirts|clothing.csv|
|21d56b6a011f91f4163fcb13d416aa4e1a2c7d82115b3fd3d831241fd63|Pants|clothing.csv|
|166ca9b3a59edaf774d107533fba2c70ed309516376ce2693e92c777dd971c4b|Cardigans|clothing.csv|
|176146e4ae48e70df2e628b45dccfd53405c73f951c003fb8c9c09b3207e7aab|Wallets|accessories.csv|
|63d42170fa2d706101ab713de2313ad3f9a05aa0b1c875a56545cfd69f7101fe|Purses|accessories.csv|


# Class level description

PMGAssignmentApp -> Main class that invokes the project.

ArgumentParser -> It takes the input file paths and validates the arguments.

CSVFileReadWrite -> The main logic is implemented here, where it reads the csv files and writes the data as per requirements.

CombineCSV -> It combines the given set of csv files into one.

FileReadWrite -> It is an interface, where all the declarations are present.
