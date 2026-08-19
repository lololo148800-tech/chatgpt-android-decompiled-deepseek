package p288Lb;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p001A.C0093v0;
import p214Ib.AbstractC3656B;
import p214Ib.C3667j;
import p214Ib.C3669l;
import p214Ib.InterfaceC3657C;
import p214Ib.InterfaceC3672o;
import p240Jb.InterfaceC4324a;
import p265Kb.AbstractC4611d;

/* JADX INFO: renamed from: Lb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4970c implements InterfaceC3657C {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16202Y;

    /* JADX INFO: renamed from: Z */
    public final C0093v0 f16203Z;

    public /* synthetic */ C4970c(C0093v0 c0093v0, int i10) {
        this.f16202Y = i10;
        this.f16203Z = c0093v0;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC3656B m5611b(C0093v0 c0093v0, C3669l c3669l, TypeToken typeToken, InterfaceC4324a interfaceC4324a) {
        AbstractC3656B c4986s;
        Object objMo3263R = c0093v0.m345n(TypeToken.get(interfaceC4324a.value())).mo3263R();
        boolean zNullSafe = interfaceC4324a.nullSafe();
        if (objMo3263R instanceof AbstractC3656B) {
            c4986s = (AbstractC3656B) objMo3263R;
        } else if (objMo3263R instanceof InterfaceC3657C) {
            c4986s = ((InterfaceC3657C) objMo3263R).mo4360a(c3669l, typeToken);
        } else {
            if (!(objMo3263R instanceof InterfaceC3672o)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo3263R.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            c4986s = new C4986s(objMo3263R instanceof InterfaceC3672o ? (InterfaceC3672o) objMo3263R : null, c3669l, typeToken, null, zNullSafe);
            zNullSafe = false;
        }
        return (c4986s == null || !zNullSafe) ? c4986s : new C3667j(c4986s, 2);
    }

    @Override // p214Ib.InterfaceC3657C
    /* JADX INFO: renamed from: a */
    public final AbstractC3656B mo4360a(C3669l c3669l, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = Object.class;
        C0093v0 c0093v0 = this.f16203Z;
        switch (this.f16202Y) {
            case 0:
                Type type2 = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                AbstractC4611d.m5343b(Collection.class.isAssignableFrom(rawType));
                Type typeM5351j = AbstractC4611d.m5351j(type2, rawType, AbstractC4611d.m5347f(type2, rawType, Collection.class), new HashMap());
                type = typeM5351j instanceof ParameterizedType ? ((ParameterizedType) typeM5351j).getActualTypeArguments()[0] : Object.class;
                return new C4969b(c3669l, type, c3669l.m4372f(TypeToken.get(type)), c0093v0.m345n(typeToken));
            case 1:
                InterfaceC4324a interfaceC4324a = (InterfaceC4324a) typeToken.getRawType().getAnnotation(InterfaceC4324a.class);
                if (interfaceC4324a == null) {
                    return null;
                }
                return m5611b(c0093v0, c3669l, typeToken, interfaceC4324a);
            default:
                Type type3 = typeToken.getType();
                Class rawType2 = typeToken.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    AbstractC4611d.m5343b(Map.class.isAssignableFrom(rawType2));
                    Type typeM5351j2 = AbstractC4611d.m5351j(type3, rawType2, AbstractC4611d.m5347f(type3, rawType2, Map.class), new HashMap());
                    actualTypeArguments = typeM5351j2 instanceof ParameterizedType ? ((ParameterizedType) typeM5351j2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                return new C4976i(this, c3669l, actualTypeArguments[0], (type4 == Boolean.TYPE || type4 == Boolean.class) ? AbstractC4992y.f16274c : c3669l.m4372f(TypeToken.get(type4)), actualTypeArguments[1], c3669l.m4372f(TypeToken.get(actualTypeArguments[1])), c0093v0.m345n(typeToken));
        }
    }
}
