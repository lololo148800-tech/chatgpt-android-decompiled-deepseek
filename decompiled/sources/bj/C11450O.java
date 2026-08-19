package bj;

import android.gov.nist.core.Separators;
import dj.AbstractC13178c;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: bj.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C11450O extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final Class f34615a;

    /* JADX INFO: renamed from: b */
    public final String[] f34616b;

    /* JADX INFO: renamed from: c */
    public final Enum[] f34617c;

    /* JADX INFO: renamed from: d */
    public final C11475v f34618d;

    public C11450O(Class cls) {
        this.f34615a = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f34617c = enumArr;
            this.f34616b = new String[enumArr.length];
            int i10 = 0;
            while (true) {
                Enum[] enumArr2 = this.f34617c;
                if (i10 >= enumArr2.length) {
                    this.f34618d = C11475v.m12866a(this.f34616b);
                    return;
                }
                String strName = enumArr2[i10].name();
                String[] strArr = this.f34616b;
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
        int iMo12799C0 = abstractC11477x.mo12799C0(this.f34618d);
        if (iMo12799C0 != -1) {
            return this.f34617c[iMo12799C0];
        }
        String strM12867E = abstractC11477x.m12867E();
        throw new C11473t("Expected one of " + Arrays.asList(this.f34616b) + " but was " + abstractC11477x.mo12820x() + " at path " + strM12867E);
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        abstractC11440E.mo12828V0(this.f34616b[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.f34615a.getName() + Separators.RPAREN;
    }
}
