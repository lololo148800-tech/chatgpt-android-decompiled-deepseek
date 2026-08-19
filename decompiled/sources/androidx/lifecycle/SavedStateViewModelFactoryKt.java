package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"lifecycle-viewmodel-savedstate_release"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class SavedStateViewModelFactoryKt {

    /* JADX INFO: renamed from: a */
    public static final List f33421a = AbstractC17681o.m19382k(Application.class, C11082S.class);

    /* JADX INFO: renamed from: b */
    public static final List f33422b = AbstractC9393x3.m9974d(C11082S.class);

    /* JADX INFO: renamed from: a */
    public static final Constructor m12134a(Class cls, List signature) {
        AbstractC16544l.m18094g(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC16544l.m18093f(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC16544l.m18093f(parameterTypes, "constructor.parameterTypes");
            List listM19291N = AbstractC17678l.m19291N(parameterTypes);
            if (signature.equals(listM19291N)) {
                return constructor;
            }
            if (signature.size() == listM19291N.size() && listM19291N.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final ViewModel m12135b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
