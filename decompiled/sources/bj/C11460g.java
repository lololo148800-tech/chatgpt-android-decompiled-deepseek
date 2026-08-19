package bj;

import android.gov.nist.core.Separators;
import dj.AbstractC13178c;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: bj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C11460g extends AbstractC11471r {

    /* JADX INFO: renamed from: d */
    public static final C11459f f34658d = new C11459f(0);

    /* JADX INFO: renamed from: e */
    public static final C11459f f34659e = new C11459f(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34660a = 1;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f34661b;

    /* JADX INFO: renamed from: c */
    public final Object f34662c;

    public C11460g(AbstractC11471r abstractC11471r, String str) {
        this.f34661b = abstractC11471r;
        this.f34662c = str;
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        switch (this.f34660a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                abstractC11477x.mo12812a();
                while (abstractC11477x.hasNext()) {
                    arrayList.add(this.f34661b.fromJson(abstractC11477x));
                }
                abstractC11477x.mo12817k();
                Object objNewInstance = Array.newInstance((Class<?>) this.f34662c, arrayList.size());
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Array.set(objNewInstance, i10, arrayList.get(i10));
                }
                return objNewInstance;
            case 1:
                C11444I c11444i = new C11444I();
                abstractC11477x.mo12814e();
                while (abstractC11477x.hasNext()) {
                    abstractC11477x.mo12809W();
                    Object objFromJson = this.f34661b.fromJson(abstractC11477x);
                    Object objFromJson2 = ((AbstractC11471r) this.f34662c).fromJson(abstractC11477x);
                    Object objPut = c11444i.put(objFromJson, objFromJson2);
                    if (objPut != null) {
                        throw new C11473t("Map key '" + objFromJson + "' has multiple values at path " + abstractC11477x.m12867E() + ": " + objPut + " and " + objFromJson2);
                    }
                }
                abstractC11477x.mo12818m();
                return c11444i;
            default:
                return this.f34661b.fromJson(abstractC11477x);
        }
    }

    @Override // bj.AbstractC11471r
    public boolean isLenient() {
        switch (this.f34660a) {
            case 2:
                return this.f34661b.isLenient();
            default:
                return super.isLenient();
        }
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        switch (this.f34660a) {
            case 0:
                abstractC11440E.mo12832a();
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    this.f34661b.toJson(abstractC11440E, Array.get(obj, i10));
                }
                abstractC11440E.mo12834m();
                return;
            case 1:
                abstractC11440E.mo12833e();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new C11473t("Map key is null at " + abstractC11440E.m12835P());
                    }
                    int iM12837j0 = abstractC11440E.m12837j0();
                    if (iM12837j0 != 5 && iM12837j0 != 3) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    abstractC11440E.f34578t0 = true;
                    this.f34661b.toJson(abstractC11440E, entry.getKey());
                    ((AbstractC11471r) this.f34662c).toJson(abstractC11440E, entry.getValue());
                }
                abstractC11440E.mo12823E();
                return;
            default:
                String str = abstractC11440E.f34575q0;
                if (str == null) {
                    str = "";
                }
                abstractC11440E.mo12840v0((String) this.f34662c);
                try {
                    this.f34661b.toJson(abstractC11440E, obj);
                    return;
                } finally {
                    abstractC11440E.mo12840v0(str);
                }
        }
    }

    public final String toString() {
        switch (this.f34660a) {
            case 0:
                return this.f34661b + ".array()";
            case 1:
                return "JsonAdapter(" + this.f34661b + Separators.EQUALS + ((AbstractC11471r) this.f34662c) + Separators.RPAREN;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f34661b);
                sb2.append(".indent(\"");
                return AbstractC9306j0.m9891j((String) this.f34662c, "\")", sb2);
        }
    }

    public C11460g(C11447L c11447l, Type type, Type type2) {
        c11447l.getClass();
        Set set = AbstractC13178c.f41820a;
        this.f34661b = c11447l.m12849a(type, set);
        this.f34662c = c11447l.m12849a(type2, set);
    }

    public C11460g(Class cls, AbstractC11471r abstractC11471r) {
        this.f34662c = cls;
        this.f34661b = abstractC11471r;
    }
}
