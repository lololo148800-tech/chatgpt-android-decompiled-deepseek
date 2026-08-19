package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes2.dex */
public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {

    /* JADX INFO: renamed from: a */
    public final KotlinTypeRefiner f53242a;

    /* JADX INFO: renamed from: b */
    public final KotlinTypePreparator f53243b;

    /* JADX INFO: renamed from: c */
    public final OverridingUtil f53244c;

    public NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC16544l.m18094g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f53242a = kotlinTypeRefiner;
        this.f53243b = kotlinTypePreparator;
        OverridingUtil overridingUtilCreateWithTypeRefiner = OverridingUtil.createWithTypeRefiner(getKotlinTypeRefiner());
        AbstractC16544l.m18093f(overridingUtilCreateWithTypeRefiner, "createWithTypeRefiner(...)");
        this.f53244c = overridingUtilCreateWithTypeRefiner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean equalTypes(KotlinType a10, KotlinType b) {
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        return equalTypes(ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(false, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), a10.unwrap(), b.unwrap());
    }

    public KotlinTypePreparator getKotlinTypePreparator() {
        return this.f53243b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public KotlinTypeRefiner getKotlinTypeRefiner() {
        return this.f53242a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public OverridingUtil getOverridingUtil() {
        return this.f53244c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean isSubtypeOf(KotlinType subtype, KotlinType supertype) {
        AbstractC16544l.m18094g(subtype, "subtype");
        AbstractC16544l.m18094g(supertype, "supertype");
        return isSubtypeOf(ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(true, false, null, getKotlinTypePreparator(), getKotlinTypeRefiner(), 6, null), subtype.unwrap(), supertype.unwrap());
    }

    public final boolean equalTypes(TypeCheckerState typeCheckerState, UnwrappedType a10, UnwrappedType b) {
        AbstractC16544l.m18094g(typeCheckerState, "<this>");
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, a10, b);
    }

    public final boolean isSubtypeOf(TypeCheckerState typeCheckerState, UnwrappedType subType, UnwrappedType superType) {
        AbstractC16544l.m18094g(typeCheckerState, "<this>");
        AbstractC16544l.m18094g(subType, "subType");
        AbstractC16544l.m18094g(superType, "superType");
        return AbstractTypeChecker.isSubtypeOf$default(AbstractTypeChecker.INSTANCE, typeCheckerState, subType, superType, false, 8, null);
    }

    public /* synthetic */ NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinTypeRefiner, (i10 & 2) != 0 ? KotlinTypePreparator.Default.INSTANCE : kotlinTypePreparator);
    }
}
