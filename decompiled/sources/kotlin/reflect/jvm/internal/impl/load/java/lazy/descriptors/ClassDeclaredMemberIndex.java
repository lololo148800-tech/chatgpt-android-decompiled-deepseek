package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p049Bm.InterfaceC1436k;
import p077Cn.C1756x;
import p1091wn.AbstractC21031l;
import p1091wn.C21025f;
import p1091wn.C21027h;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* JADX INFO: renamed from: a */
    public final JavaClass f51873a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f51874b;

    /* JADX INFO: renamed from: c */
    public final C1756x f51875c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f51876d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f51877e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f51878f;

    public ClassDeclaredMemberIndex(JavaClass jClass, InterfaceC1436k memberFilter) {
        AbstractC16544l.m18094g(jClass, "jClass");
        AbstractC16544l.m18094g(memberFilter, "memberFilter");
        this.f51873a = jClass;
        this.f51874b = memberFilter;
        C1756x c1756x = new C1756x(this, 14);
        this.f51875c = c1756x;
        C21027h c21027hM21487k = AbstractC21031l.m21487k(AbstractC17680n.m19329H(jClass.getMethods()), c1756x);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C21025f c21025f = new C21025f(c21027hM21487k);
        while (c21025f.hasNext()) {
            Object next = c21025f.next();
            Name name = ((JavaMethod) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f51876d = linkedHashMap;
        C21027h c21027hM21487k2 = AbstractC21031l.m21487k(AbstractC17680n.m19329H(this.f51873a.getFields()), this.f51874b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C21025f c21025f2 = new C21025f(c21027hM21487k2);
        while (c21025f2.hasNext()) {
            Object next2 = c21025f2.next();
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.f51877e = linkedHashMap2;
        Collection<JavaRecordComponent> recordComponents = this.f51873a.getRecordComponents();
        InterfaceC1436k interfaceC1436k = this.f51874b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : recordComponents) {
            if (((Boolean) interfaceC1436k.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((JavaRecordComponent) obj2).getName(), obj2);
        }
        this.f51878f = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaField findFieldByName(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return (JavaField) this.f51877e.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Collection<JavaMethod> findMethodsByName(Name name) {
        AbstractC16544l.m18094g(name, "name");
        List list = (List) this.f51876d.get(name);
        return list != null ? list : C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaRecordComponent findRecordComponentByName(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return (JavaRecordComponent) this.f51878f.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getFieldNames() {
        C21027h c21027hM21487k = AbstractC21031l.m21487k(AbstractC17680n.m19329H(this.f51873a.getFields()), this.f51874b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C21025f c21025f = new C21025f(c21027hM21487k);
        while (c21025f.hasNext()) {
            linkedHashSet.add(((JavaField) c21025f.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getMethodNames() {
        C21027h c21027hM21487k = AbstractC21031l.m21487k(AbstractC17680n.m19329H(this.f51873a.getMethods()), this.f51875c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C21025f c21025f = new C21025f(c21027hM21487k);
        while (c21025f.hasNext()) {
            linkedHashSet.add(((JavaMethod) c21025f.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getRecordComponentNames() {
        return this.f51878f.keySet();
    }
}
