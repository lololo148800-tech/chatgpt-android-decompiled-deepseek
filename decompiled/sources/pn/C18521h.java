package pn;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p049Bm.InterfaceC1436k;
import p658b5.C11234e;

/* JADX INFO: renamed from: pn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C18521h implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final TypeConstructor f59018Y;

    /* JADX INFO: renamed from: Z */
    public final List f59019Z;

    /* JADX INFO: renamed from: o0 */
    public final TypeAttributes f59020o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f59021p0;

    /* JADX INFO: renamed from: q0 */
    public final MemberScope f59022q0;

    public C18521h(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z6, MemberScope memberScope) {
        this.f59018Y = typeConstructor;
        this.f59019Z = list;
        this.f59020o0 = typeAttributes;
        this.f59021p0 = z6;
        this.f59022q0 = memberScope;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinTypeFactory.INSTANCE.getClass();
        TypeConstructor typeConstructor = this.f59018Y;
        List list = this.f59019Z;
        C11234e c11234eM18416a = KotlinTypeFactory.m18416a(typeConstructor, kotlinTypeRefiner, list);
        if (c11234eM18416a == null) {
            return null;
        }
        SimpleType simpleType = (SimpleType) c11234eM18416a.f34001Z;
        if (simpleType != null) {
            return simpleType;
        }
        TypeConstructor typeConstructor2 = (TypeConstructor) c11234eM18416a.f34002o0;
        AbstractC16544l.m18091d(typeConstructor2);
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(this.f59020o0, typeConstructor2, list, this.f59021p0, this.f59022q0);
    }
}
