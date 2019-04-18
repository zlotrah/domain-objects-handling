package io.domain.favorite.controller

import io.domain.favorite.dto.RoleDto
import io.domain.favorite.service.endpoint.RoleEndpoint
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author esuyorkulov
 */
@RestController
@RequestMapping("/api/roles")
class RoleApiController(
        private val roleEndpoint: RoleEndpoint
) {

    @GetMapping("/{roleId}")
    fun get(@PathVariable roleId: Long): RoleDto {
        return roleEndpoint.getRole(roleId)
    }

}