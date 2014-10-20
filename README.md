This is an example of how to create a JSON Schema from a POJO.  

This example will generate this schema:
```json
{
  "type" : "object",
  "id" : "urn:jsonschema:com:bmchild:model:SimplePojo",
  "properties" : {
    "children" : {
      "type" : "array",
      "items" : {
        "type" : "object",
        "id" : "urn:jsonschema:com:bmchild:model:SimplePojoChild",
        "properties" : {
          "cName" : {
            "type" : "string"
          },
          "id" : {
            "type" : "integer"
          },
          "cDescription" : {
            "type" : "string"
          }
        }
      }
    },
    "name" : {
      "type" : "string"
    },
    "description" : {
      "type" : "string"
    },
    "id" : {
      "type" : "integer"
    }
  }
}
```