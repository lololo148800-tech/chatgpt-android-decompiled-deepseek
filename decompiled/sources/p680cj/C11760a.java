package p680cj;

import android.gov.nist.core.Separators;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11473t;
import bj.C11475v;
import bj.EnumC11476w;
import bj.InterfaceC11468o;
import dj.AbstractC13178c;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: cj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11760a extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final Class f35664a;

    /* JADX INFO: renamed from: b */
    public final String[] f35665b;

    /* JADX INFO: renamed from: c */
    public final Enum[] f35666c;

    /* JADX INFO: renamed from: d */
    public final C11475v f35667d;

    /* JADX INFO: renamed from: e */
    public final boolean f35668e;

    public C11760a(Class cls, boolean z6) {
        this.f35664a = cls;
        this.f35668e = z6;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f35666c = enumArr;
            this.f35665b = new String[enumArr.length];
            int i10 = 0;
            while (true) {
                Enum[] enumArr2 = this.f35666c;
                if (i10 >= enumArr2.length) {
                    this.f35667d = C11475v.m12866a(this.f35665b);
                    return;
                }
                String strName = enumArr2[i10].name();
                String[] strArr = this.f35665b;
                Field field = cls.getField(strName);
                Set set = AbstractC13178c.f41820a;
                InterfaceC11468o interfaceC11468o = (InterfaceC11468o) field.getAnnotation(InterfaceC11468o.class);
                if (interfaceC11468o != null) {
                    String strName2 = interfaceC11468o.name();
                    if (!"\u0000".equals(strName2)) {
                        strName = strName2;
                    }
                }
                strArr[i10] = strName;
                i10++;
            }
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e10);
        }
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        int iMo12799C0 = abstractC11477x.mo12799C0(this.f35667d);
        if (iMo12799C0 != -1) {
            return this.f35666c[iMo12799C0];
        }
        String strM12867E = abstractC11477x.m12867E();
        if (this.f35668e) {
            if (abstractC11477x.mo12805S() == EnumC11476w.f34691r0) {
                abstractC11477x.mo12800D();
                return null;
            }
            throw new C11473t("Expected a string but was " + abstractC11477x.mo12805S() + " at path " + strM12867E);
        }
        throw new C11473t("Expected one of " + Arrays.asList(this.f35665b) + " but was " + abstractC11477x.mo12820x() + " at path " + strM12867E);
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        Enum r6 = (Enum) obj;
        if (r6 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11440E.mo12828V0(this.f35665b[r6.ordinal()]);
    }

    public final String toString() {
        return "EnumJsonAdapter(" + this.f35664a.getName() + Separators.RPAREN;
    }
}
