package p605Ym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Ym.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10094h implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29885Y;

    /* JADX INFO: renamed from: Z */
    public final LazyJavaPackageFragment f29886Z;

    public /* synthetic */ C10094h(LazyJavaPackageFragment lazyJavaPackageFragment, int i10) {
        this.f29885Y = i10;
        this.f29886Z = lazyJavaPackageFragment;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        LazyJavaPackageFragment lazyJavaPackageFragment = this.f29886Z;
        switch (this.f29885Y) {
            case 0:
                List<String> listFindPackageParts = lazyJavaPackageFragment.f51920t0.getComponents().getPackagePartProvider().findPackageParts(lazyJavaPackageFragment.getFqName().asString());
                ArrayList arrayList = new ArrayList();
                for (String str : listFindPackageParts) {
                    ClassId.Companion companion = ClassId.Companion;
                    FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                    AbstractC16544l.m18093f(fqNameForTopLevelClassMaybeWithDollars, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaPackageFragment.f51920t0.getComponents().getKotlinClassFinder(), companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), lazyJavaPackageFragment.f51921u0);
                    C17309l c17309l = kotlinJvmBinaryClassFindKotlinClass != null ? new C17309l(str, kotlinJvmBinaryClassFindKotlinClass) : null;
                    if (c17309l != null) {
                        arrayList.add(c17309l);
                    }
                }
                return AbstractC17659D.m19253o(arrayList);
            case 1:
                Collection<JavaPackage> subPackages = lazyJavaPackageFragment.f51919s0.getSubPackages();
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(subPackages, 10));
                Iterator<T> it = subPackages.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((JavaPackage) it.next()).getFqName());
                }
                return arrayList2;
            default:
                InterfaceC3776x[] interfaceC3776xArr = LazyJavaPackageFragment.f51918A0;
                HashMap map = new HashMap();
                for (Map.Entry<String, KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().entrySet()) {
                    String key = entry.getKey();
                    KotlinJvmBinaryClass value = entry.getValue();
                    JvmClassName jvmClassNameByInternalName = JvmClassName.byInternalName(key);
                    AbstractC16544l.m18093f(jvmClassNameByInternalName, "byInternalName(...)");
                    KotlinClassHeader classHeader = value.getClassHeader();
                    int i10 = LazyJavaPackageFragment.WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
                    if (i10 == 1) {
                        String multifileClassName = classHeader.getMultifileClassName();
                        if (multifileClassName != null) {
                            map.put(jvmClassNameByInternalName, JvmClassName.byInternalName(multifileClassName));
                        }
                    } else if (i10 == 2) {
                        map.put(jvmClassNameByInternalName, jvmClassNameByInternalName);
                    }
                }
                return map;
        }
    }
}
