package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleDependenciesImpl implements ModuleDependencies {

    /* JADX INFO: renamed from: a */
    public final List f51567a;

    /* JADX INFO: renamed from: b */
    public final Set f51568b;

    /* JADX INFO: renamed from: c */
    public final List f51569c;

    public ModuleDependenciesImpl(List<ModuleDescriptorImpl> allDependencies, Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible, List<ModuleDescriptorImpl> directExpectedByDependencies, Set<ModuleDescriptorImpl> allExpectedByDependencies) {
        AbstractC16544l.m18094g(allDependencies, "allDependencies");
        AbstractC16544l.m18094g(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        AbstractC16544l.m18094g(directExpectedByDependencies, "directExpectedByDependencies");
        AbstractC16544l.m18094g(allExpectedByDependencies, "allExpectedByDependencies");
        this.f51567a = allDependencies;
        this.f51568b = modulesWhoseInternalsAreVisible;
        this.f51569c = directExpectedByDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> getAllDependencies() {
        return this.f51567a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> getDirectExpectedByDependencies() {
        return this.f51569c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible() {
        return this.f51568b;
    }
}
