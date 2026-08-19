package p613Z4;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import p719e5.C13285a;

/* JADX INFO: renamed from: Z4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C10165l {

    /* JADX INFO: renamed from: a */
    public final AbstractC10159f f30100a;

    /* JADX INFO: renamed from: b */
    public final C10154a f30101b;

    /* JADX INFO: renamed from: c */
    public final AbstractC10159f f30102c;

    /* JADX INFO: renamed from: d */
    public final AbstractC10159f f30103d;

    public C10165l(Context context, C13285a taskExecutor) {
        Context applicationContext = context.getApplicationContext();
        AbstractC16544l.m18093f(applicationContext, "context.applicationContext");
        AbstractC16544l.m18094g(taskExecutor, "taskExecutor");
        C10154a c10154a = new C10154a(applicationContext, taskExecutor, 0);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC16544l.m18093f(applicationContext2, "context.applicationContext");
        AbstractC16544l.m18094g(taskExecutor, "taskExecutor");
        C10154a c10154a2 = new C10154a(applicationContext2, taskExecutor, 1);
        Context applicationContext3 = context.getApplicationContext();
        AbstractC16544l.m18093f(applicationContext3, "context.applicationContext");
        String str = AbstractC10162i.f30097a;
        AbstractC16544l.m18094g(taskExecutor, "taskExecutor");
        AbstractC10159f c10161h = Build.VERSION.SDK_INT >= 24 ? new C10161h(applicationContext3, taskExecutor) : new C10163j(applicationContext3, taskExecutor);
        Context applicationContext4 = context.getApplicationContext();
        AbstractC16544l.m18093f(applicationContext4, "context.applicationContext");
        AbstractC16544l.m18094g(taskExecutor, "taskExecutor");
        C10154a c10154a3 = new C10154a(applicationContext4, taskExecutor, 2);
        AbstractC16544l.m18094g(taskExecutor, "taskExecutor");
        this.f30100a = c10154a;
        this.f30101b = c10154a2;
        this.f30102c = c10161h;
        this.f30103d = c10154a3;
    }
}
