(ns clj-portugol.portugol
  (:use clj-portugol.core))

(defmacro programa [& args] `(defn ~'-main ~@args))

(def fns-map '{
               take pegue
               drop descarte
               inc incremente
               dec decremente
               range extensão
               take-while pegue-enquanto
               drop-while descarte-enquanto
               ;; interleave interleave
               reduce injete
               map mapeie
               ;; hash-map hash-map
               list lista
               set conjunto
               ;; hash-set hash-set
               atom átomo
               agent agente
               first primeiro
               second segundo
               last último
               butlast exceto-último
               rest exceto-primeiro
               next próximo
               true verdadeiro
               false falso
               print imprima
               println imprima-linha
               filter filtre
               remove remova
               keep mantenha
               ;; slurp slurp
               ;; spit spit
               seq sequência
               ;; dorun dorun
               ;; doall doall
               str cadeia
               ;; interpose interpose
               find encontre
               get obtenha
               apply aplique
               count conte
               every? todos?
               true? é-verdadeiro?
               false? é-falso?
               concat una
               identity identidade
               reverse reverta
               some algum
               flatten achate
               boolean lógico})

(def forms-map '{
                 if se
                 when quando
                 if-not se-não
                 when-not quando-não
                 def defina
                 fn função
                 defn defina-função
                 let seja
                 and e
                 or ou
                 not não
                 loop laço
                 ;; doseq doseq
                 for para
                 cond escolha
                 do faça
                 deftest defina-teste
                 testing testando
                 is é
                 are são})

(translate-fns fns-map)

(translate-forms forms-map)
