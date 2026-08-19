package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p909nm.AbstractC17686t;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {

    /* JADX INFO: renamed from: a */
    public final List f52896a;

    public CompositeSyntheticJavaPartsProvider(List<? extends SyntheticJavaPartsProvider> inner) {
        AbstractC16544l.m18094g(inner, "inner");
        this.f52896a = inner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateConstructors(ClassDescriptor thisDescriptor, List<ClassConstructorDescriptor> result, LazyJavaResolverContext c9) {
        AbstractC16544l.m18094g(thisDescriptor, "thisDescriptor");
        AbstractC16544l.m18094g(result, "result");
        AbstractC16544l.m18094g(c9, "c");
        Iterator it = this.f52896a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateConstructors(thisDescriptor, result, c9);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateMethods(ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result, LazyJavaResolverContext c9) {
        AbstractC16544l.m18094g(thisDescriptor, "thisDescriptor");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(result, "result");
        AbstractC16544l.m18094g(c9, "c");
        Iterator it = this.f52896a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateMethods(thisDescriptor, name, result, c9);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateNestedClass(ClassDescriptor thisDescriptor, Name name, List<ClassDescriptor> result, LazyJavaResolverContext c9) {
        AbstractC16544l.m18094g(thisDescriptor, "thisDescriptor");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(result, "result");
        AbstractC16544l.m18094g(c9, "c");
        Iterator it = this.f52896a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateNestedClass(thisDescriptor, name, result, c9);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateStaticFunctions(ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result, LazyJavaResolverContext c9) {
        AbstractC16544l.m18094g(thisDescriptor, "thisDescriptor");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(result, "result");
        AbstractC16544l.m18094g(c9, "c");
        Iterator it = this.f52896a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateStaticFunctions(thisDescriptor, name, result, c9);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getMethodNames(ClassDescriptor thisDescriptor, LazyJavaResolverContext c9) {
        AbstractC16544l.m18094g(thisDescriptor, "thisDescriptor");
        AbstractC16544l.m18094g(c9, "c");
        List list = this.f52896a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((SyntheticJavaPartsProvider) it.next()).getMethodNames(thisDescriptor, c9), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getNestedClassNames(ClassDescriptor thisDescriptor, LazyJavaResolverContext c9) {
        AbstractC16544l.m18094g(thisDescriptor, "thisDescriptor");
        AbstractC16544l.m18094g(c9, "c");
        List list = this.f52896a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((SyntheticJavaPartsProvider) it.next()).getNestedClassNames(thisDescriptor, c9), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getStaticFunctionNames(ClassDescriptor thisDescriptor, LazyJavaResolverContext c9) {
        AbstractC16544l.m18094g(thisDescriptor, "thisDescriptor");
        AbstractC16544l.m18094g(c9, "c");
        List list = this.f52896a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((SyntheticJavaPartsProvider) it.next()).getStaticFunctionNames(thisDescriptor, c9), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public PropertyDescriptorImpl modifyField(ClassDescriptor thisDescriptor, PropertyDescriptorImpl propertyDescriptor, LazyJavaResolverContext c9) {
        AbstractC16544l.m18094g(thisDescriptor, "thisDescriptor");
        AbstractC16544l.m18094g(propertyDescriptor, "propertyDescriptor");
        AbstractC16544l.m18094g(c9, "c");
        Iterator it = this.f52896a.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((SyntheticJavaPartsProvider) it.next()).modifyField(thisDescriptor, propertyDescriptor, c9);
        }
        return propertyDescriptor;
    }
}
