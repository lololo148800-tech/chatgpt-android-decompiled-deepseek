package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.AbstractC10818a;
import androidx.appcompat.widget.Toolbar;
import p893n.C17372d;
import p976r.C18816n;
import p999s.C19320T0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.l */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC12047l implements View.OnClickListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f36575Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f36576Z;

    public /* synthetic */ ViewOnClickListenerC12047l(Object obj, int i10) {
        this.f36575Y = i10;
        this.f36576Z = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.f36575Y) {
            case 0:
                C12048m c12048m = (C12048m) this.f36576Z;
                int i10 = c12048m.f36580l1;
                if (i10 == 2) {
                    c12048m.m13627R(1);
                    return;
                } else {
                    if (i10 == 1) {
                        c12048m.m13627R(2);
                        return;
                    }
                    return;
                }
            case 1:
                C12050o c12050o = (C12050o) this.f36576Z;
                Button button = c12050o.f36603M1;
                c12050o.m13630R();
                throw null;
            case 2:
                C17372d c17372d = (C17372d) this.f36576Z;
                if (view == c17372d.f55459g && (message3 = c17372d.f55461i) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != c17372d.f55462j || (message2 = c17372d.f55464l) == null) {
                    messageObtain = (view != c17372d.f55465m || (message = c17372d.f55467o) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c17372d.f55451C.obtainMessage(1, c17372d.f55454b).sendToTarget();
                return;
            case 3:
                ((AbstractC10818a) this.f36576Z).mo11098a();
                return;
            default:
                C19320T0 c19320t0 = ((Toolbar) this.f36576Z).f32286a1;
                C18816n c18816n = c19320t0 == null ? null : c19320t0.f61193Z;
                if (c18816n != null) {
                    c18816n.collapseActionView();
                    return;
                }
                return;
        }
    }
}
