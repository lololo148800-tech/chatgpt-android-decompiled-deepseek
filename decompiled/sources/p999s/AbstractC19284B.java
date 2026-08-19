package p999s;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p030B2.AbstractC0738T;
import p030B2.C0751d;
import p030B2.InterfaceC0749c;
import p477Tb.C7296c;

/* JADX INFO: renamed from: s.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19284B {
    /* JADX INFO: renamed from: a */
    public static boolean m20346a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0749c c7296c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c7296c = new C7296c(clipData, 3);
            } else {
                C0751d c0751d = new C0751d();
                c0751d.f2125Z = clipData;
                c0751d.f2126o0 = 3;
                c7296c = c0751d;
            }
            AbstractC0738T.m1580h(textView, c7296c.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20347b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0749c c7296c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c7296c = new C7296c(clipData, 3);
        } else {
            C0751d c0751d = new C0751d();
            c0751d.f2125Z = clipData;
            c0751d.f2126o0 = 3;
            c7296c = c0751d;
        }
        AbstractC0738T.m1580h(view, c7296c.build());
        return true;
    }
}
