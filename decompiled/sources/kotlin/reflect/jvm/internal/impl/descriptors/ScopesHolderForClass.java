package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p298Lm.C5140G;
import p298Lm.C5150L;

/* JADX INFO: loaded from: classes2.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: a */
    public final ClassDescriptor f51417a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f51418b;

    /* JADX INFO: renamed from: c */
    public final KotlinTypeRefiner f51419c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue f51420d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC3776x[] f51416e = {AbstractC16526C.f51263a.mo5699h(new C16553u(ScopesHolderForClass.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final <T extends MemberScope> ScopesHolderForClass<T> create(ClassDescriptor classDescriptor, StorageManager storageManager, KotlinTypeRefiner kotlinTypeRefinerForOwnerModule, InterfaceC1436k scopeFactory) {
            AbstractC16544l.m18094g(classDescriptor, "classDescriptor");
            AbstractC16544l.m18094g(storageManager, "storageManager");
            AbstractC16544l.m18094g(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            AbstractC16544l.m18094g(scopeFactory, "scopeFactory");
            return new ScopesHolderForClass<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }
    }

    public ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, InterfaceC1436k interfaceC1436k, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this.f51417a = classDescriptor;
        this.f51418b = interfaceC1436k;
        this.f51419c = kotlinTypeRefiner;
        this.f51420d = storageManager.createLazyValue(new C5140G(this, 8));
    }

    public final T getScope(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        ClassDescriptor classDescriptor = this.f51417a;
        boolean zIsRefinementNeededForModule = kotlinTypeRefiner.isRefinementNeededForModule(DescriptorUtilsKt.getModule(classDescriptor));
        NotNullLazyValue notNullLazyValue = this.f51420d;
        InterfaceC3776x[] interfaceC3776xArr = f51416e;
        if (!zIsRefinementNeededForModule) {
            return (T) StorageKt.getValue(notNullLazyValue, this, interfaceC3776xArr[0]);
        }
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.isRefinementNeededForTypeConstructor(typeConstructor) ? (T) StorageKt.getValue(notNullLazyValue, this, interfaceC3776xArr[0]) : (T) kotlinTypeRefiner.getOrPutScopeForClass(classDescriptor, new C5150L(this, 8, kotlinTypeRefiner));
    }
}
