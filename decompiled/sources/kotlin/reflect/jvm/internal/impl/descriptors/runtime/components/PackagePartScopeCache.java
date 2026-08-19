package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import p571X9.AbstractC9393x3;
import p817j$.util.concurrent.ConcurrentHashMap;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class PackagePartScopeCache {

    /* JADX INFO: renamed from: a */
    public final DeserializedDescriptorResolver f51659a;

    /* JADX INFO: renamed from: b */
    public final ReflectKotlinClassFinder f51660b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f51661c;

    public PackagePartScopeCache(DeserializedDescriptorResolver resolver, ReflectKotlinClassFinder kotlinClassFinder) {
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(kotlinClassFinder, "kotlinClassFinder");
        this.f51659a = resolver;
        this.f51660b = kotlinClassFinder;
        this.f51661c = new ConcurrentHashMap();
    }

    public final MemberScope getPackagePartScope(ReflectKotlinClass fileClass) {
        Collection collectionM9974d;
        AbstractC16544l.m18094g(fileClass, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.f51661c;
        ClassId classId = fileClass.getClassId();
        Object obj = concurrentHashMap.get(classId);
        if (obj == null) {
            FqName packageFqName = fileClass.getClassId().getPackageFqName();
            KotlinClassHeader.Kind kind = fileClass.getClassHeader().getKind();
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            DeserializedDescriptorResolver deserializedDescriptorResolver = this.f51659a;
            if (kind == kind2) {
                List<String> multifilePartNames = fileClass.getClassHeader().getMultifilePartNames();
                collectionM9974d = new ArrayList();
                for (String str : multifilePartNames) {
                    ClassId.Companion companion = ClassId.Companion;
                    FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                    AbstractC16544l.m18093f(fqNameForTopLevelClassMaybeWithDollars, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.f51660b, companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), DeserializationHelpersKt.jvmMetadataVersionOrDefault(deserializedDescriptorResolver.getComponents().getConfiguration()));
                    if (kotlinJvmBinaryClassFindKotlinClass != null) {
                        collectionM9974d.add(kotlinJvmBinaryClassFindKotlinClass);
                    }
                }
            } else {
                collectionM9974d = AbstractC9393x3.m9974d(fileClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(deserializedDescriptorResolver.getComponents().getModuleDescriptor(), packageFqName);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionM9974d.iterator();
            while (it.hasNext()) {
                MemberScope memberScopeCreateKotlinPackagePartScope = deserializedDescriptorResolver.createKotlinPackagePartScope(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it.next());
                if (memberScopeCreateKotlinPackagePartScope != null) {
                    arrayList.add(memberScopeCreateKotlinPackagePartScope);
                }
            }
            List listM19322C0 = AbstractC17680n.m19322C0(arrayList);
            MemberScope memberScopeCreate = ChainedMemberScope.Companion.create("package " + packageFqName + " (" + fileClass + ')', listM19322C0);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(classId, memberScopeCreate);
            obj = objPutIfAbsent == null ? memberScopeCreate : objPutIfAbsent;
        }
        AbstractC16544l.m18093f(obj, "getOrPut(...)");
        return (MemberScope) obj;
    }
}
