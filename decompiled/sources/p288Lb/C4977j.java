package p288Lb;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p214Ib.AbstractC3656B;
import p214Ib.C3666i;
import p214Ib.C3669l;
import p214Ib.EnumC3655A;
import p214Ib.InterfaceC3657C;

/* JADX INFO: renamed from: Lb.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4977j implements InterfaceC3657C {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16220Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f16221Z;

    public /* synthetic */ C4977j(Object obj, int i10) {
        this.f16220Y = i10;
        this.f16221Z = obj;
    }

    @Override // p214Ib.InterfaceC3657C
    /* JADX INFO: renamed from: a */
    public final AbstractC3656B mo4360a(C3669l c3669l, TypeToken typeToken) {
        switch (this.f16220Y) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (C4971d) this.f16221Z;
                }
                return null;
            case 1:
                if (typeToken.getRawType() == Object.class) {
                    return new C4978k(c3669l, (EnumC3655A) this.f16221Z);
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (C3666i) this.f16221Z;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f16220Y) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C3666i) this.f16221Z) + "]";
            default:
                return super.toString();
        }
    }
}
