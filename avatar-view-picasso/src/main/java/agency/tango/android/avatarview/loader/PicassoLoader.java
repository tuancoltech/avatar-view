package agency.tango.android.avatarview.loader;

import androidx.annotation.NonNull;

import com.squareup.picasso.Picasso;

import agency.tango.android.avatarview.AvatarPlaceholder;
import agency.tango.android.avatarview.ImageLoaderBase;
import agency.tango.android.avatarview.views.AvatarView;

public class PicassoLoader extends ImageLoaderBase {

    public PicassoLoader() {
        super();
    }

    public PicassoLoader(String defaultPlaceholderString) {
        super(defaultPlaceholderString);
    }

    @Override
    public void loadImage(@NonNull AvatarView avatarView, @NonNull AvatarPlaceholder avatarPlaceholder, String avatarUrl) {
        Picasso.with(avatarView.getContext())
                .load(avatarUrl)
                .placeholder(avatarPlaceholder)
                .fit()
                .into(avatarView);
    }
}
