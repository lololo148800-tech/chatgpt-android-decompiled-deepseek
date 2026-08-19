package p288Lb;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import p214Ib.AbstractC3656B;
import p214Ib.C3667j;
import p214Ib.C3669l;
import p214Ib.InterfaceC3657C;
import p265Kb.AbstractC4611d;
import p358Ob.C6162a;

/* JADX INFO: renamed from: Lb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4968a implements InterfaceC3657C {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16197Y;

    public /* synthetic */ C4968a(int i10) {
        this.f16197Y = i10;
    }

    @Override // p214Ib.InterfaceC3657C
    /* JADX INFO: renamed from: a */
    public final AbstractC3656B mo4360a(C3669l c3669l, TypeToken typeToken) {
        switch (this.f16197Y) {
            case 0:
                Type type = typeToken.getType();
                boolean z6 = type instanceof GenericArrayType;
                if (!z6 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z6 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new C4969b(c3669l, c3669l.m4372f(TypeToken.get(genericComponentType)), AbstractC4611d.m5348g(genericComponentType));
            case 1:
                if (typeToken.getRawType() == Date.class) {
                    return new C4971d();
                }
                return null;
            case 2:
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new C4987t(rawType);
            case 3:
                if (typeToken.getRawType() == java.sql.Date.class) {
                    return new C6162a(0);
                }
                return null;
            case 4:
                if (typeToken.getRawType() == Time.class) {
                    return new C6162a(1);
                }
                return null;
            case 5:
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                c3669l.getClass();
                return new C6162a(c3669l.m4372f(TypeToken.get(Date.class)));
            default:
                return new C3667j(new C3667j(c3669l.m4373g(this, typeToken), 3), 2);
        }
    }
}
