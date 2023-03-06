package com.example.mactemplate.domain.usecase

interface BaseUseCase<in Parameter, out Result> {
    suspend operator fun invoke(params: Parameter): Result
}

interface BaseUseCaseWithoutSuspend<in Parameter, out Result> {
    operator fun invoke(params: Parameter): Result
}