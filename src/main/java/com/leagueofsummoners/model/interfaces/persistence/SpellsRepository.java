package com.leagueofsummoners.model.interfaces.persistence;


import com.leagueofsummoners.model.dto.ChampionSpellDTO;
import org.springframework.data.repository.Repository;

import java.util.List;

/*
Autores= Juan José Ramírez & Isidoro Martín
Fecha= Junio de 2016
Licencia=  gp130
Version= 1.0
Descripcion= Proyecto final desarrollo de aplicaciones web. League of Summoners es una aplicación
enfocada a los jugadores del popular juego League of Legends, usando esta aplicación podrán acceder
a guías, detalles sobre campeones e incluso sus últimas partidas.

Copyright (C) 2016 Juan José Ramírez & Isidoro Martín
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

/**
 * Este bean obtiene los datos de la entidad Champion_spells de la base de datos
 */
@org.springframework.stereotype.Repository
public interface SpellsRepository extends Repository<ChampionSpellDTO, Long> {

	/**
	 * Obtiene una lista con todas lasmagias
	 * @return Todas las magias
	 */
	List<ChampionSpellDTO> findAll();

	/**
	 * Obtiene las magias de un campeón determinado
	 * @param idChampion
	 * @return Las magías de ese campeón
	 */
	List<ChampionSpellDTO> findByIdChampion(Long idChampion);

}
