package p544W9;

import android.gov.nist.core.Separators;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p650ui.node.Owner;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.android.replay.viewhierarchy.AbstractC15316d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p1113xn.AbstractC21322p;
import p1140z1.C21658D;
import p298Lm.C5166b;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: W9.u3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8722u3 {
    /* JADX INFO: renamed from: a */
    public static final String m9438a(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC16544l.m18093f(parameterTypes, "getParameterTypes(...)");
        sb2.append(AbstractC17678l.m19283F(parameterTypes, "", Separators.LPAREN, Separators.RPAREN, C5166b.f16835y0, 24));
        Class<?> returnType = method.getReturnType();
        AbstractC16544l.m18093f(returnType, "getReturnType(...)");
        sb2.append(ReflectClassUtilKt.getDesc(returnType));
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m9439b(View view, AbstractC15316d abstractC15316d, C15524y1 c15524y1) {
        C21658D root;
        if (view instanceof ViewGroup) {
            if (AbstractC21322p.m21667A(view.getClass().getName(), "AndroidComposeView", false)) {
                try {
                    Owner owner = view instanceof Owner ? (Owner) view : null;
                    if (owner != null && (root = owner.getRoot()) != null) {
                        AbstractC8728v3.m9453c(root, abstractC15316d, true, c15524y1);
                        return;
                    }
                } catch (Throwable th2) {
                    c15524y1.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    AbstractC15316d abstractC15316dM9464a = AbstractC8734w3.m9464a(childAt, abstractC15316d, viewGroup.indexOfChild(childAt), c15524y1);
                    arrayList.add(abstractC15316dM9464a);
                    m9439b(childAt, abstractC15316dM9464a, c15524y1);
                }
            }
            abstractC15316d.f47848f = arrayList;
        }
    }
}
