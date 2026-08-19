package p239Ja;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: Ja.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC4298a implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13974a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f13975b;

    public /* synthetic */ ViewOnFocusChangeListenerC4298a(Object obj, int i10) {
        this.f13974a = i10;
        this.f13975b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z6) {
        switch (this.f13974a) {
            case 0:
                C4301d c4301d = (C4301d) this.f13975b;
                c4301d.m5051t(c4301d.m5052u());
                break;
            case 1:
                C4309l c4309l = (C4309l) this.f13975b;
                c4309l.f14006l = z6;
                c4309l.m5122q();
                if (!z6) {
                    c4309l.m5065t(false);
                    c4309l.f14007m = false;
                }
                break;
            default:
                if (z6) {
                    EditText editText = (EditText) this.f13975b;
                    Editable text = editText.getText();
                    editText.setSelection(text != null ? text.length() : 0);
                }
                break;
        }
    }
}
