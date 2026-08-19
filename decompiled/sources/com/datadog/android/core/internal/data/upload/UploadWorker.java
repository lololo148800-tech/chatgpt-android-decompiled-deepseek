package com.datadog.android.core.internal.data.upload;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p087D7.AbstractC1977d;
import p444S4.C7001g;
import p444S4.C7008n;
import p523V9.AbstractC7889G0;
import p641a7.AbstractC10516b;
import p661b7.EnumC11255b;
import p765g7.InterfaceC13823a;
import p849k7.C16359l;
import p849k7.C16360m;
import p887m7.C17175a;
import p887m7.RunnableC17195u;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m18067d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "m7/u", "dd-sdk-android-core_release"}, m18068k = 1, m18069mv = {1, 7, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UploadWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC16544l.m18094g(appContext, "appContext");
        AbstractC16544l.m18094g(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: f */
    public final C7008n mo12336f() {
        Object obj = this.f22417Z.f33697b.f22408a.get("_dd.sdk.instanceName");
        InterfaceC13823a interfaceC13823aM10971a = AbstractC10516b.m10971a(obj instanceof String ? (String) obj : null);
        InterfaceC13823a interfaceC13823a = interfaceC13823aM10971a instanceof InterfaceC13823a ? interfaceC13823aM10971a : null;
        if (interfaceC13823a == null || (interfaceC13823a instanceof C16359l)) {
            AbstractC7889G0.m8184b(AbstractC1977d.f5849a, 5, EnumC11255b.f34098Y, C17175a.f54864s0, null, false, 56);
            return new C7008n(C7001g.f22407c);
        }
        List<C16360m> listMo15449e = interfaceC13823a.mo15449e();
        ArrayList arrayList = new ArrayList();
        for (C16360m c16360m : listMo15449e) {
            if (!(c16360m instanceof C16360m)) {
                c16360m = null;
            }
            if (c16360m != null) {
                arrayList.add(c16360m);
            }
        }
        List listM19324E0 = AbstractC17680n.m19324E0(arrayList);
        Collections.shuffle(listM19324E0);
        LinkedList linkedList = new LinkedList();
        Iterator it = listM19324E0.iterator();
        while (it.hasNext()) {
            linkedList.offer(new RunnableC17195u(linkedList, interfaceC13823a, (C16360m) it.next()));
        }
        while (!linkedList.isEmpty()) {
            RunnableC17195u runnableC17195u = (RunnableC17195u) linkedList.poll();
            if (runnableC17195u != null) {
                runnableC17195u.run();
            }
        }
        return new C7008n(C7001g.f22407c);
    }
}
