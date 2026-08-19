package p228J;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: J.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3807I {

    /* JADX INFO: renamed from: a */
    public static final Set f11515a = DesugarCollections.unmodifiableSet(EnumSet.of(EnumC3850n.f11640p0, EnumC3850n.f11641q0, EnumC3850n.f11642r0, EnumC3850n.f11643s0));

    /* JADX INFO: renamed from: b */
    public static final Set f11516b = DesugarCollections.unmodifiableSet(EnumSet.of(EnumC3852o.f11650p0, EnumC3852o.f11647Y));

    /* JADX INFO: renamed from: c */
    public static final Set f11517c;

    /* JADX INFO: renamed from: d */
    public static final Set f11518d;

    static {
        EnumC3848m enumC3848m = EnumC3848m.f11634q0;
        EnumC3848m enumC3848m2 = EnumC3848m.f11633p0;
        EnumC3848m enumC3848m3 = EnumC3848m.f11630Y;
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(EnumSet.of(enumC3848m, enumC3848m2, enumC3848m3));
        f11517c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC3848m2);
        enumSetCopyOf.remove(enumC3848m3);
        f11518d = DesugarCollections.unmodifiableSet(enumSetCopyOf);
    }
}
