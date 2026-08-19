package p523V9;

import android.content.Context;
import android.graphics.Typeface;
import fk.EnumC13687h;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.InterfaceC16536d;
import p225Im.InterfaceC3756d;
import p647ak.InterfaceC10717n;
import p909nm.AbstractC17678l;
import p931ok.AbstractC18220a;
import p955q2.AbstractC18619k;

/* JADX INFO: renamed from: V9.m0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8138m0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC3756d m8666a(Annotation annotation) {
        AbstractC16544l.m18094g(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        AbstractC16544l.m18093f(clsAnnotationType, "annotationType(...)");
        return m8670e(clsAnnotationType);
    }

    /* JADX INFO: renamed from: b */
    public static final Class m8667b(InterfaceC3756d interfaceC3756d) {
        AbstractC16544l.m18094g(interfaceC3756d, "<this>");
        Class clsMo5684d = ((InterfaceC16536d) interfaceC3756d).mo5684d();
        AbstractC16544l.m18092e(clsMo5684d, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo5684d;
    }

    /* JADX INFO: renamed from: c */
    public static final Class m8668c(InterfaceC3756d interfaceC3756d) {
        AbstractC16544l.m18094g(interfaceC3756d, "<this>");
        Class clsMo5684d = ((InterfaceC16536d) interfaceC3756d).mo5684d();
        if (!clsMo5684d.isPrimitive()) {
            return clsMo5684d;
        }
        String name = clsMo5684d.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsMo5684d : Double.class;
            case 104431:
                return !name.equals("int") ? clsMo5684d : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsMo5684d : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsMo5684d : Character.class;
            case 3327612:
                return !name.equals("long") ? clsMo5684d : Long.class;
            case 3625364:
                return !name.equals("void") ? clsMo5684d : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsMo5684d : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsMo5684d : Float.class;
            case 109413500:
                return !name.equals("short") ? clsMo5684d : Short.class;
            default:
                return clsMo5684d;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public static final Class m8669d(InterfaceC3756d interfaceC3756d) {
        AbstractC16544l.m18094g(interfaceC3756d, "<this>");
        Class clsMo5684d = ((InterfaceC16536d) interfaceC3756d).mo5684d();
        if (clsMo5684d.isPrimitive()) {
            return clsMo5684d;
        }
        String name = clsMo5684d.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC3756d m8670e(Class cls) {
        AbstractC16544l.m18094g(cls, "<this>");
        return AbstractC16526C.f51263a.mo5693b(cls);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8671f(InterfaceC10717n interfaceC10717n) {
        return !interfaceC10717n.mo11008b() || System.currentTimeMillis() - interfaceC10717n.mo11007a() > 10000;
    }

    /* JADX INFO: renamed from: g */
    public static final Typeface m8672g(Context context, String str) {
        Typeface typefaceM19975b;
        String strConcat = str.concat(".ttf");
        HashMap map = AbstractC18220a.f58063a;
        if (map.containsKey(strConcat)) {
            typefaceM19975b = (Typeface) map.get(strConcat);
        } else {
            String[] list = context.getAssets().list("fonts/");
            if (list == null || !AbstractC17678l.m19298e(strConcat, list)) {
                Integer numM8410f = AbstractC8040Z5.m8410f(context, str, EnumC13687h.f43182Y);
                typefaceM19975b = numM8410f != null ? AbstractC18619k.m19975b(context, numM8410f.intValue()) : null;
            } else {
                typefaceM19975b = Typeface.createFromAsset(context.getAssets(), "fonts/" + strConcat);
            }
        }
        map.put(strConcat, typefaceM19975b);
        return typefaceM19975b;
    }
}
