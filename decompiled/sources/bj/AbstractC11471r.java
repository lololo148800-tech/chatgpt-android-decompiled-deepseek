package bj;

import dj.C13176a;
import dj.C13177b;
import java.io.IOException;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p026Ao.C0675i;
import p026Ao.InterfaceC0676j;
import p026Ao.InterfaceC0677k;

/* JADX INFO: renamed from: bj.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11471r {
    @CheckReturnValue
    public final AbstractC11471r failOnUnknown() {
        return new C11469p(this, 2);
    }

    public abstract Object fromJson(AbstractC11477x abstractC11477x);

    @CheckReturnValue
    @Nullable
    public final Object fromJson(String str) {
        C0675i c0675i = new C0675i();
        c0675i.m1444l1(str);
        C11478y c11478y = new C11478y(c0675i);
        Object objFromJson = fromJson(c11478y);
        if (isLenient() || c11478y.mo12805S() == EnumC11476w.f34695v0) {
            return objFromJson;
        }
        throw new C11473t("JSON document was not fully consumed.");
    }

    @CheckReturnValue
    @Nullable
    public final Object fromJsonValue(@Nullable Object obj) {
        C11437B c11437b = new C11437B();
        int[] iArr = c11437b.f34698Z;
        int i10 = c11437b.f34697Y;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        c11437b.f34555s0 = objArr;
        c11437b.f34697Y = i10 + 1;
        objArr[i10] = obj;
        try {
            return fromJson(c11437b);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @CheckReturnValue
    public AbstractC11471r indent(String str) {
        if (str != null) {
            return new C11460g(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    @CheckReturnValue
    public final AbstractC11471r lenient() {
        return new C11469p(this, 1);
    }

    @CheckReturnValue
    public final AbstractC11471r nonNull() {
        return this instanceof C13176a ? this : new C13176a(this);
    }

    @CheckReturnValue
    public final AbstractC11471r nullSafe() {
        return this instanceof C13177b ? this : new C13177b(this);
    }

    @CheckReturnValue
    public final AbstractC11471r serializeNulls() {
        return new C11469p(this, 0);
    }

    @CheckReturnValue
    public final String toJson(@Nullable Object obj) {
        C0675i c0675i = new C0675i();
        try {
            toJson(c0675i, obj);
            return c0675i.m1428Z0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void toJson(AbstractC11440E abstractC11440E, Object obj);

    @CheckReturnValue
    @Nullable
    public final Object toJsonValue(@Nullable Object obj) {
        C11439D c11439d = new C11439D();
        c11439d.f34569v0 = new Object[32];
        c11439d.m12839r0(6);
        try {
            toJson(c11439d, obj);
            int i10 = c11439d.f34571Y;
            if (i10 > 1 || (i10 == 1 && c11439d.f34572Z[i10 - 1] != 7)) {
                throw new IllegalStateException("Incomplete document");
            }
            return c11439d.f34569v0[0];
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void toJson(InterfaceC0676j interfaceC0676j, @Nullable Object obj) {
        toJson(new C11479z(interfaceC0676j), obj);
    }

    @CheckReturnValue
    @Nullable
    public final Object fromJson(InterfaceC0677k interfaceC0677k) {
        return fromJson(new C11478y(interfaceC0677k));
    }
}
