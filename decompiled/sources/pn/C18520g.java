package pn;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p049Bm.InterfaceC1436k;
import p658b5.C11234e;

/* JADX INFO: renamed from: pn.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C18520g implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final TypeConstructor f59014Y;

    /* JADX INFO: renamed from: Z */
    public final List f59015Z;

    /* JADX INFO: renamed from: o0 */
    public final TypeAttributes f59016o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f59017p0;

    public C18520g(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z6) {
        this.f59014Y = typeConstructor;
        this.f59015Z = list;
        this.f59016o0 = typeAttributes;
        this.f59017p0 = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        KotlinTypeRefiner refiner = (KotlinTypeRefiner) obj;
        AbstractC16544l.m18094g(refiner, "refiner");
        KotlinTypeFactory.INSTANCE.getClass();
        TypeConstructor typeConstructor = this.f59014Y;
        List list = this.f59015Z;
        C11234e c11234eM18416a = KotlinTypeFactory.m18416a(typeConstructor, refiner, list);
        if (c11234eM18416a == null) {
            return null;
        }
        SimpleType simpleType = (SimpleType) c11234eM18416a.f34001Z;
        if (simpleType != null) {
            return simpleType;
        }
        TypeConstructor typeConstructor2 = (TypeConstructor) c11234eM18416a.f34002o0;
        AbstractC16544l.m18091d(typeConstructor2);
        return KotlinTypeFactory.simpleType(this.f59016o0, typeConstructor2, (List<? extends TypeProjection>) list, this.f59017p0, refiner);
    }
}
