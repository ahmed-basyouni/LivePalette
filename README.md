# LivePalette


A live data layer on top of android palette (easy and hassle-free)

[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-LivePalette-green.svg?style=flat )]( https://android-arsenal.com/details/1/7310 )

# how to use

````
compile 'com.ark.android:livepalette:0.2.0'
````

#### easy just call

````
LiveData<List<Palette.Swatch>> liveData = LivePalette.analyze(bitmap);
liveData.observe(this, new Observer<List<Palette.Swatch>>() {
                    @Override
                    public void onChanged(@Nullable List<Palette.Swatch> swatches) {
                     
                    }
                });
````                

No need to provide a thread the LivePalette take care of that by calling the generate version of the Palette that call an asynctask

#### That's it happy coding

# License

  The MIT License (MIT)

    Copyright (c) 2018 Ahmed basyouni

    Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
