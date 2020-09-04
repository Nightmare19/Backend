const express = require('express');
const router = express.Router();
const db = require('../models');
const post = require('../models/person');

//mostra todas as pessoas
router.get("/persons", (req, res) => {
    db.Person.findAll().then(persons => res.send(persons));
});
//mostra uma pessoa busccando por id
router.get("/persons/:id", (req, res) => {
    db.Person.findAll({ where: { id: req.params.id } }).then(persons => res.send(persons));
});

//cria uma nova pessoa
router.put('/persons', (req, res) => {
    db.Person.create({
        Firstname: req.body.Firstname,
        Lastname: req.body.Lastname,
        Profession: req.body.Profession,
        Age: req.body.Age
    }).then(submitedPerson => res.send(submitedPerson));
});
// apagar uma pessoa pelo id

router.delete("/persons/:id", (req, res) => {
    db.Person.destroy({ where: { id: req.params.id } }).then(() => res.send("Apagado"));
});

//update pessoa pelo id

router.post("/persons/:id", (req, res) => {
    db.Person.update({
        Firstname: req.body.Firstname,
        Lastname: req.body.Lastname,
        Profession: req.body.Profession,
        Age: req.body.Age
    }, {
        where: { id: req.params.id }
    }).then(() => res.send("Modificado com sucesso"))
})

// buscar as pessoas com a idade e profissao


router.get("/persons/:age/:profession", (req, res) => {
    db.Person.findAll({
        where: { age: req.params.age, profession: req.params.profession }
    }).then(persons => res.send(persons))
})

module.exports = router;