package p1068vo;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1081wc.C20873T;
import p523V9.AbstractC8160o6;
import p909nm.AbstractC17659D;
import p909nm.C17690x;
import p972qm.C18778k;
import p985r9.C18903m;

/* JADX INFO: renamed from: vo.i */
/* JADX INFO: loaded from: classes2.dex */
public class C20659i {

    /* JADX INFO: renamed from: a */
    public final Object f65541a;

    /* JADX INFO: renamed from: b */
    public Object f65542b;

    /* JADX INFO: renamed from: c */
    public Object f65543c;

    public /* synthetic */ C20659i(Object obj, Object obj2, Object obj3) {
        this.f65541a = obj;
        this.f65542b = obj2;
        this.f65543c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public void m21207a(int i10) {
        C18778k c18778k = (C18778k) this.f65542b;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                c18778k.resumeWith(C17690x.f56481Y);
                return;
            }
            return;
        }
        try {
            Bundle bundle = (Bundle) ((C18903m) this.f65541a).m20217a().f45414Y;
            c18778k.resumeWith(AbstractC17659D.m19244f(new C17309l("install_referrer", bundle.getString("install_referrer")), new C17309l("referrer_click_timestamp_seconds", String.valueOf(bundle.getLong("referrer_click_timestamp_seconds"))), new C17309l("install_begin_timestamp_seconds", String.valueOf(bundle.getLong("install_begin_timestamp_seconds"))), new C17309l("referrer_click_timestamp_server_seconds", String.valueOf(bundle.getLong("referrer_click_timestamp_server_seconds"))), new C17309l("referrer_click_timestamp_server_seconds", String.valueOf(bundle.getLong("install_begin_timestamp_server_seconds")))));
        } catch (RemoteException e10) {
            AbstractC8160o6.m8731f(((C20873T) this.f65543c).f66453p0, "Failed to get referrer details", e10, null, 4);
            c18778k.resumeWith(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public InputMethodManager m21208b() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f65542b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.f65541a).getContext().getSystemService("input_method");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.f65542b = inputMethodManager2;
        return inputMethodManager2;
    }

    /* JADX INFO: renamed from: c */
    public void mo21209c(KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = (BaseInputConnection) this.f65543c;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection((View) this.f65541a, false);
            this.f65543c = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }

    public C20659i(View view) {
        this.f65541a = view;
    }

    /* JADX INFO: renamed from: d */
    public void mo21210d() {
    }
}
