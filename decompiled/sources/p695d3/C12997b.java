package p695d3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.android.core.AbstractC15256t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC7849B0;
import p571X9.AbstractC9233X;
import p656b3.AbstractC11225d;
import p656b3.C11224c;
import p656b3.C11227f;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: d3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12997b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f41247Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Intent f41248Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f41249o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12997b(Intent intent, Context context, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f41248Z = intent;
        this.f41249o0 = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C12997b(this.f41248Z, this.f41249o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C12997b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        C17296C c17296c = C17296C.f55119a;
        Intent intent = this.f41248Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f41247Y;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    throw new IllegalArgumentException("The intent must have action parameters extras.");
                }
                Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
                if (bundle == null) {
                    throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
                }
                C11227f c11227fM8107b = AbstractC7849B0.m8107b(new AbstractC11225d[0]);
                Iterator<T> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashMap = c11227fM8107b.f33982a;
                    if (!zHasNext) {
                        break;
                    }
                    String str = (String) it.next();
                    C11224c c11224c = new C11224c(str);
                    Object obj2 = bundle.get(str);
                    linkedHashMap.get(c11224c);
                    if (obj2 == null) {
                        linkedHashMap.remove(c11224c);
                    } else {
                        linkedHashMap.put(c11224c, obj2);
                    }
                }
                if (extras.containsKey("android.widget.extra.CHECKED")) {
                    C11224c c11224c2 = AbstractC13002g.f41257a;
                    Boolean boolValueOf = Boolean.valueOf(extras.getBoolean("android.widget.extra.CHECKED"));
                    linkedHashMap.get(c11224c2);
                    linkedHashMap.put(c11224c2, boolValueOf);
                }
                String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
                if (string == null) {
                    throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
                }
                if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                    throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
                }
                extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId");
                Context context = this.f41249o0;
                this.f41247Y = 1;
                Class<?> cls = Class.forName(string);
                if (!InterfaceC12996a.class.isAssignableFrom(cls)) {
                    throw new IllegalStateException("Provided class must implement ActionCallback.");
                }
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                AbstractC16544l.m18092e(objNewInstance, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
                ((InterfaceC12996a) objNewInstance).mo14389a(context);
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                if (c17296c == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            AbstractC15256t.m16466d("GlanceAppWidget", "Error in Glance App Widget", th2);
        }
        return c17296c;
    }
}
